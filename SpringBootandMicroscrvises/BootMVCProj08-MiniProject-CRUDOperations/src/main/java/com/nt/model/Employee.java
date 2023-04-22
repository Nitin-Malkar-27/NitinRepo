package com.nt.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Employee implements Serializable{
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_id_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length=20)
	private String ename;
	private String job;
	private Float sal;
	private Integer deptno;

}
/*
add the following properties in application.properties 
=>For data source cfg
=>For jpa-hibernate properties
=>For view resovlers
=>For Embadded Ports(server)
=>For context path of web application while running in Embadded Tomcat server


//application.properties

#for ViewResolver
spring.mvc.view.prefix=/WEB-INF/pages
spring.mvc.view.sufix=.jsp

#for embedded server
server.port=4041

#Context path
server.servlet.context-path=/Employee-CRUDOperartions

#DataSource cfg
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:orcle:thin:@localhost:1521:xe
spring.datasource.ursername=root
spring.datasource.password=root

#Hibernet -JPA properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
*/
