//DiagnosticCenterCatalog.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data
public class DiagnosticCenterCatalog {
	@Value("${dc.xrayRate}")
	   private Double xrayPrice;
	@Value("${dc.ctscanRate}")
	   private Double ctscanPrice;
	@Value("${dc.mriscanRate}")
	   private Double mriScanPrice;
	@Value("${dc.ecgRate}")
	   private Double ecgPrice;
	
	//setter && getter

	public Double getXrayPrice() {
		return xrayPrice;
	}
	public void setXrayPrice(Double xrayPrice) {
		this.xrayPrice = xrayPrice;
	}
	public Double getCtscanPrice() {
		return ctscanPrice;
	}
	public void setCtscanPrice(Double ctscanPrice) {
		this.ctscanPrice = ctscanPrice;
	}
	public Double getMriScanPrice() {
		return mriScanPrice;
	}
	public void setMriScanPrice(Double mriScanPrice) {
		this.mriScanPrice = mriScanPrice;
	}
	public Double getEcgPrice() {
		return ecgPrice;
	}
	public void setEcgPrice(Double ecgPrice) {
		this.ecgPrice = ecgPrice;
	}
	
	
}
