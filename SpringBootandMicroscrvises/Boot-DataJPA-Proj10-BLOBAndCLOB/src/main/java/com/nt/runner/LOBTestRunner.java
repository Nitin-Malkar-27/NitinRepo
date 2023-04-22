package com.nt.runner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMatrimonyServiceMgmt;

@Component
public class LOBTestRunner implements CommandLineRunner {
	@Autowired
	private IMatrimonyServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
     /*  Scanner sc=new Scanner(System.in);
         System.out.println("Enter person name ::");
         String name=sc.next();
         System.out.println("Enter person address ::");
         String addrs=sc.next();
         System.out.println("Enter person photo complet file path ::");
         String photoPath=sc.next().replace("?", "");
         System.out.println("Enter person biodata complet file path ::");
         String biodataPath=sc.next().replace("?", "");
         System.out.println("is the person Indian ::");
         boolean indian=sc.nextBoolean();
         //prepare byte[] repersenting photo file content 
         InputStream is=new InputStream(photoPath);
		 byte[] photoData=new byte[is.available()];
		 photoData=is.readAllBytes();
		 //prepare char[] representing photo file content
		File file=new File(biodataPath);
		Reader reader=new FileReader(file);
		char bioDataContent[]=new char[(int)file.length()];
		reader.read(bioDataContent);
		
		//prepare Entity class.obj
		MarriageSeeker seeker=new MarriageSeeker(name,photoData,
				              LocalDateTime.of(1990,11,23,12,45),bioDataContent,indian);
		System.out.println(service.registerMarriageSeeker(seeker));*/
        System.out.println("==============================================");
        Optional<MarriageSeeker> opt=service.searchSeekerById(4L);
        if(opt.isPresent()) {
        	MarriageSeeker seeker=opt.get();
        	System.out.println(seeker.getId()+" "+seeker.getName()+" "+seeker.getAddrs()+" "+seeker.isIndian());
        	OutputStream os=new FileOutputStream("retrive_photo.gfif");
        	os.write(seeker.getPhoto());
        	os.flush();
        	Writer writer=new FileWriter("tetrive_biodata.txt");
        	writer.write(seeker.getBiodata());
        	writer.flush();
        	os.close();
        	writer.close();
        	System.out.println("LOBs are retrived");
        	
        }
        else {
        	System.out.println("Record not found");
        }
	}

}
