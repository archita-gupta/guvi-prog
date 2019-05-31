import java.io.*;
import java.util.*;

class GFG {
    public static void Palindrome(int n){
        int res=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            res=(res*10)+rem;
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
    Palindrome(n);
   
    
	}
}