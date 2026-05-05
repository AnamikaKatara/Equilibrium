package RevStrng;


public class ReverseStrng {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Hello World";
  String rev="";
  StringBuffer reverse=new StringBuffer();
  int a=0;
  
  int length=str.length();
  
  for (int i=(length-1);i>=0;i--)
  {
	 rev+=str.charAt(i);
  }
  StringBuffer revers= new StringBuffer(str);
  String reversed =revers.reverse().toString();
  
  
 
  System.out.print("rev="+rev);
  System.out.print("reversed="+revers);
  
	}


}