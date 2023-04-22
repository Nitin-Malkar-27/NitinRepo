//DTDC.java
package com.nt.comp;

public final class DTDC implements Courier {

	@Override
	public String deliver(int iod) {
		return iod+"order items are kept fot delivery by DTDC";
	}

}
