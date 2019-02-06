import java.util.Scanner;
import java.lang.*;
import java.io.*;
class alphabet
{  
public static void main (String[] args)   
{    	
Scanner ob = new Scanner(System.in);    
	char ch= ob.next().charAt(0);
  if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	{
		System.out.println("Consonant");
	}
	else
	{		
	System.out.println("No");	
  }
}
}
