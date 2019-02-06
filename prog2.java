import java.util.Scanner;
import java.lang.*;
import java.io.*;
class oddoreven
{  
public static void main (String[] args)   
{    
Scanner ob = new Scanner(System.in);    
System.out.println("INPUT");    
int num= ob.nextInt();    
System.out.println("OUTPUT");    
if((num%2)==0)    
{    
System.out.println("even");    
}    
else     
{
System.out.println("odd");  
}  
}
}
