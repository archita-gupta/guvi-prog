import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    String[] str=input.split(" ");
    int n=Integer.parseInt(str[0]);
    int k=Integer.parseInt(str[1]);
    int res=(int)Math.pow(n,k);
    System.out.println(res);
    
	}
}