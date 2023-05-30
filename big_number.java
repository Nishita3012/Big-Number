package ternary_op;
import java.util.Scanner;

public class big_number {
	
	
	public static void main(String []args) {
		
		Scanner ss=new Scanner(System.in);
		
		System.out.print("Num 1:");
		int num1=ss.nextInt();
		
		System.out.print("Num 2:");
		int num2=ss.nextInt();
		
		int output = (num1>num2)?num1:num2;
      System.out.println("Bigger number is:"+output);
	}
}
