package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.document.StockDetails;
import com.nt.service.IStockMgmtService;

public class MongoTemplateTestRunner implements CommandLineRunner {
    @Autowired
	private IStockMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------save document operation---------------");
        StockDetails details=new StockDetails(new Random().nextInt(1000),"ICICI",9999.9,"BSE");
        String result=service.registerStockDetails(details);
        System.out.println(result);
        
        
        System.out.println("------inserAll(-)to save multipal document------");
        StockDetails details1=new StockDetails(new Random().nextInt(1000),"ICICI",9999.9,"BSE");
        StockDetails details2=new StockDetails(new Random().nextInt(1000),"SBI",8888.9,"BSE");
        StockDetails details3=new StockDetails(new Random().nextInt(1000),"Bajaj",7777.9,"BSE");
        String msg=service.registerStockDetailsBatch(List.of(details1,details2,details3));
        System.out.println(msg);
        
        //System.out.println("-----find(-,-0)for selecting the documents------");
        service.fetchStockDetailsByExchange("BSE").forEach(System.out::println);
        System.out.println("----------------------------------------");
        service.fetchStockDetailsByExchangePriserRange(500, 10000.0).forEach(System.out::println);
	}
	

}
