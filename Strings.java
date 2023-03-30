

package cycle2;

import java.util.*;

public class Strings {

public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the string");
      String x = in.nextLine();
      int ch;
      do {
    	  System.out.println("Select the choice for different string methods:");
    	  System.out.println(" 1.Uppercase  2.Lowercase 3.length 4.concatinate 5.Equals 6.Replace 0.exit");
    	  
    	  System.out.println("Enter your choice:");
    	  ch = in.nextInt();
    	  
    	  switch(ch) {
    	  
    	  case 1:System.out.println(x.toUpperCase());
    	  break;
    	  
    	  case 2:System.out.println(x.toLowerCase());
    	  break;
    	  
    	  case 3:System.out.println("Length of the string: " + x.length());
    	  break;
    	  
    	  case 4:System.out.println("Enter the string to concantinate");
    	         String y = in.next();
    	         System.out.println(x.concat(y));
    	  break; 
    	  
    	  case 5:System.out.println("Enter another string");
    	         String x1 = in.next();
    	         System.out.println(x.equals(x1));
    	  break;
    	  
    	  case 6:System.out.println("Enter the character to be replace:");
    	         String c1 = in.next();
    	         
    	         System.out.println("Enter the new character to replace:");
    	         String c2 = in.next();
    	         
    	         System.out.println(x.replace(c1, c2));
    	        
    	  break;
    	  
    	  case 0:break;
    		      
    	  
    	  }
      }
    	     while(ch!=0);
      }

	
}
