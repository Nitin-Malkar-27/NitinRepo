package com.nt;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollOprationasController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppRealtimeDiApplication {

	@Autowired
	private Environment env;

	@Bean(name = "c3P0Ds")
	  @Profile("test")
	  public ComboPooledDataSource createC3P0Ds()throws Exception {
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass(env.getProperty("spring.datascource.driver-class-name"));
		cds.setJdbcUrl(env.getProperty("spring.datascource.url"));
		cds.setUser(env.getProperty("spring.datascource.username"));
		cds.setPassword(env.getProperty("spring.datascource.password"));

		cds.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.minSize")));
		cds.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.maxSize")));
        return cds;
	}

}
