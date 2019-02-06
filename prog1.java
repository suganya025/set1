import java.util.Scanner;
import java.lang.*;
import java.io.*;
class numerical
{  
public static void main (String[] args)   
{
Scanner ob = new Scanner(System.in);     
int num= ob.nextInt();      
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
