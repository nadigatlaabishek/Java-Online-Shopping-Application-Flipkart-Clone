package Strings;

import java.util.Calendar;

public class currentDtaeAndTime 
{
 public static void main(String[] args) 
 {
	Calendar c1=Calendar.getInstance();
	System.out.println("Current Time and Date :");
    System.out.format("%tB %te, %tY%n", c1, c1, c1);
    System.out.format("%tl:%tM %tp%n", c1, c1, c1); 

}
}
