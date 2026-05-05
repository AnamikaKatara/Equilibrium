package BDec;

import java.math.BigDecimal;

//import com.sun.swing.internal.plaf.basic.resources.basic_sv;

public class Bigd {

	public static void main(String[] args) {
		BigDecimal a=new BigDecimal("10");
		BigDecimal b=new BigDecimal("20");
		BigDecimal sum=new BigDecimal('0');
		BigDecimal difference=new BigDecimal('0');
		BigDecimal mul=new BigDecimal('0');
		BigDecimal div=new BigDecimal('0');
		sum=a.add(b);
		difference=a.subtract(b);
		mul=a.multiply(b);
	//	div=a.divide(b,2,BigDecimal.ROUND_HALF_UP);
		System.out.println("sum="+sum.toString());
		System.out.println("mul="+mul.toString());
		System.out.println("difference="+difference.toString());
		

		

	}

}
