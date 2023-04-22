package com.nt.service;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import com.nt.document.StockDetails;

public class StockMgmtServiceImpl implements IStockMgmtService {
	@Autowired
	private MongoTemplate template;

	
	@Override
	public String registerStockDetails(StockDetails details) {
		//int idValue=template.save(details,"Stock").getStockId();  //given doc object data will be saved by creating collection called "Stock"
        //int idValue=template.save(details).getStockId();   //given doc object data will be saved by creating collection with the Document class name
		int idValue=template.insert(details).getStockId();   //given doc object data will be saved by creating collection with document class name
		return "Document is saved with id value"+idValue;
	}


	@Override
	public String registerStockDetailsBatch(List<StockDetails> list) {
		int size=((List<StockDetails>) template.insertAll(list)).size();
		return size+"no.of document are saved";
	}

	
	@Override
	public List<StockDetails> fetchStockDetailsByExchange(String exchange) {
		Query query=new Query();
//		query.addCriteria(Criteria.where("exchangeName").is(exchange));
//		List<StockDetails> list=template.find(query, StockDetails.class);
//		return list;
		return null;
	}

	
	@Override
	public List<StockDetails> fetchStockDetailsByExchangePriserRange(double startPrise, double endPrise){
		Query query=new Query();
//		query.addCriteria(Criteria.where("price").get(startPrise).let(endPrise));
//		List<StockDetails> list=template.find(query, StockDetails.class);
//   	return list;
		return null;
	}

	

}
	