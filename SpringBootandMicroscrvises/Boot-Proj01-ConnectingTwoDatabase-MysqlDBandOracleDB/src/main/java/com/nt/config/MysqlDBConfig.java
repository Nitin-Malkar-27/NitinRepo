package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

public class MysqlDBConfig {
	
	@Bean
	@ConfigurationProperties(prefix="mysql.datasource")
	@Primary
	public DataSource createMySQLDs() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="mysqlEMF")
	@Primary
	public LocalContainerEntityManagerFactoryBean
	             createMySQLEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
		//create map object having hibernate properties 
		Map<String, Object> props=new HashMap<>();
		props.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		//create and return LocalContainerEntityManagerFactoryBean class object which makes
		//Entity ManagerManagerFactory as the Spring bean
		return builder.dataSource(createMySQLDs()) //datasource
				.packages("com.nt.modul.promaotions")    //model class pkg
				.properties(props)    //hibernate properties
				.build();
	}
	
	@Bean(name="mysqlTxMgmr")
	@Primary
	public PlatformTransactionManager
	        createMysqlTxMgmr(@Qualifier("mysqlEMF")
	                                   EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}




}
