import java.io.*;
import java.util.*;

class GFG {
    public static int fact(int n){
        if(n<0){
            System.out.prinln("Invalid");
            return -1;}
            
        if(n==0 || n==1)
            return 1;
        else 
            return(n*fact(n-1));
    }
    
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int n=sc.nextInt();
    System.out.println(fact(n));
   
    
	}
}