package dsa;
import java.util.*;
public class Maximum_3_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b&&a>=c) {
			System.out.println("A is Larger");
		}else if(b>=a&&b>=c) {
			System.out.println("B is Larger");
		}else {
			System.out.println("C is Larger");
		}
		
		
	}

}
