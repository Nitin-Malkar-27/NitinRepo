package com.nt.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.LinksHandler;

@WebServlet("/")
public class NitFrontControllerServlet extends HttpServlet {
	private LinksHandler handler=null;
	
	public void init() throws ServletException{
		handler=new LinksHandler();
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("NitFrontControllerServlet.doGet()::"+req.getServletPath());
		//navgiation management
		String lvn = null;
		if(req.getServletPath().equalsIgnoreCase("/wish")) {
			lvn=handler.showWishMessage(req);
		}
		else if(req.getServletPath().equalsIgnoreCase("/lang")) {
			lvn=handler.showAllLanguages(req);
		}
		else
			lvn="home";
		
		
		
		//View managment
		String destPage=null;
		if(lvn.equalsIgnoreCase("wish_result"))
			destPage="/show_wish.jsp";
		else if(lvn.equalsIgnoreCase("all lang"))
			destPage="/show_languages.jsp";
		else
			destPage="/index.jsp";
		
		
		//forword the request to dest page
		RequestDispatcher rd=req.getRequestDispatcher(destPage);
		rd.forward(req,res); 
		
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		super.doPost(req, res);
	}

}
