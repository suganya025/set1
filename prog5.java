import java.util.Scanner;
import java.lang.*;
import java.io.*;
class largestnum
{  
	public static void main (String[] args)   
	{    
	Scanner ob = new Scanner(System.in);
  	int a= ob.nextInt();    
	int b= ob.nextInt();
	int c= ob.nextInt();
		if((a>b)&&(a>c))    		
    		{ 
     			 System.out.println(+a);  
		}   
		else if((b>a)&&(b>c))   		
    		{  
			System.out.println(+b);  	        
   		 }  
		else   
    		{    
			System.out.println(+c);   	        
    		}  
	}
}
