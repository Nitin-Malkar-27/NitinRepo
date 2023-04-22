package com.nt.service;

import java.util.List;

import com.nt.document.StockDetails;

public interface IStockMgmtService {
	public String registerStockDetails(StockDetails details);
	public String registerStockDetailsBatch(List<StockDetails>list);
	public List<StockDetails> fetchStockDetailsByExchange(String exchange);
	public List<StockDetails> fetchStockDetailsByExchangePriserRange(double startPrise,double endPrise);
}
