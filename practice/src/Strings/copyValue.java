package Strings;

public class copyValue 
{
 public static void main(String[] args) 
{
	char[] s1=new char[] {'1','2','3','4'};
	
	String s2=String.copyValueOf(s1,1,3);
	System.out.println("values "+s2);
}
}
