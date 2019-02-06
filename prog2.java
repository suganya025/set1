import java.util.Scanner;
import java.lang.*;
import java.io.*;
class oddoreven
{  
public static void main (String[] args)   
{    
Scanner ob = new Scanner(System.in);     
int num= ob.nextInt(); 
if(num>=0)
{
		if((num%2)==0)    
		{    
		System.out.println("Even");    
		}    
		else     
		{
		System.out.println("Odd");  
		}
}
else
{
	System.out.println("invalid");
}
}
}
