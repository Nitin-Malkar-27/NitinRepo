package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StockDetails {
	@Id
	private Integer stockId;
	private String stockName;
	private Double prise;
	private String exchangeName;

}
/*//In my system I don't have MongoDB because of less memory
 * 
 *  Develop Application.properties having MongoDB connection,auth properties
 *  
 *  #MongoDB Connection,Auto Properties
 *  spring.data.mongodb.host=localhost
 *  spring.data.mongodb.database=NTSPBMS615DB
 *  spring.data.mongodb.port=27017
 *  spring.data.mongodb.username=testuser
 *  spring.data.mongodb.password=testuser
 */