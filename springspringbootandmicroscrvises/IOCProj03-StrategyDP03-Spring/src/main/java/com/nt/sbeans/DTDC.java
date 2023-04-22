//DTDC.java
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {

	@Override
	public String deliver(int iod) {
		return iod+"order items are kept fot delivery by DTDC";
	}

}
