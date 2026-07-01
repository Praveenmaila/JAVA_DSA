package dsa;
import java.util.*;
public class Age {
	public static void Main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Elgible to vote");
		}else {
			System.out.println("Not Elgible to vote");
		}
	}
}
