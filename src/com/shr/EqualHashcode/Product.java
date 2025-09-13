package com.shr.EqualHashcode;

import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	
	public Product(int productId,String productName) {
		this.productId=productId;
		this.productName=productName;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product p2=(Product)obj;
			if(this.productId==p2.productId && this.productName.equals(p2.productName));
			return true;
		}
		else {
			return false;
			
		}
	}
   
}

