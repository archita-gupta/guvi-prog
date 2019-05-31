/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void isPrime(int n){
        int flag=1;
        if(n==1)
            System.out.println("yes");
        for(int i=2;i<n/2;i++){
            if (n%i==0){
                System.out.println("no");
                flag=0;
                break;
                
            }
        }
        if(flag==1)
            System.out.println("yes");
    }
    
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int n=sc.nextInt();
    isPrime(n);
   
    
	}
}