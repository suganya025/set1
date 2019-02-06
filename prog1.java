import java.util.Scanner;
import java.lang.*;
import java.io.*;
class numerical
{  
public static void main (String[] args)   
{
Scanner ob = new Scanner(System.in);    
System.out.println("INPUT");    
int num= ob.nextInt();    
System.out.println("OUTPUT");    
if(num>0)    
{
    System.out.println("Positive");    
}    
else if(num<0)    
{    
    System.out.println("Negative");    
}    
else if(num==0)    
{    
    System.out.println("Zero");    
}  
}
}  
