import java.util.*;
import java.lang.*;

class EveOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0){
			System.out.println("Invalid");
		}
		else{
			if (n%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
		}
	}
}
