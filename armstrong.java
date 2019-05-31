/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void Armstrong(int n){
        int res=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            res+=(int)Math.pow(rem,3);
            n=n/10;
        }
        
        if(res==num)
            System.out.println("yes");
        else    
            System.out.println("no");
    }
    
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int n=sc.nextInt();
    Armstrong(n);
   
    
	}
}