//IOCContainerPerformenceMonitorListener.java
package com.nt.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("pmListener")
public class IOCContainerPerformenceMonitorListener implements ApplicationListener{
    private long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		//System.out.println("onApplicationEvent(-)"+event.toString());
		if(event.toString().contains("Refreshed"))  
			start=System.currentTimeMillis();     //when IOC container is started
		else if(event.toString().contains("closed"))
			end=System.currentTimeMillis();
		System.out.println("IOC conntainer is in active mode for"+(end-start)+" ms");
		
	}
	

}
