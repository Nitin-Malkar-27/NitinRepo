//BlueDart.java
package com.nt.comp;

public final class BlueDart implements Courier{

	@Override
	public String deliver(int iod) {
		return iod+"order item are kept for delivery by BlueDart";
	}
	
}
