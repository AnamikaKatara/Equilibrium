package BDec;

import java.math.BigDecimal;

public class TaxCalc {

	public static void main(String[] args) {
		
		BigDecimal price=new BigDecimal("2500.75");
		BigDecimal tax=new BigDecimal("0.18");
		BigDecimal discount=new BigDecimal("0.1");
		BigDecimal netprice=new BigDecimal("0");
		netprice=price.subtract(price.multiply(discount)).add(price.multiply(tax));
		System.out.println("net price ="+netprice.toString());

	}

}
