package simple;
import java.util.Scanner;
public class S {
	
	public static void main (String[] args) {
		Scanner Ram = new Scanner(System.in);
		System.out.println("Enter age :-");
		int age=Ram.nextInt();
		
		switch (age) {
		
		case 1:
			System.out.println("jai shree ram");
			break;
		case 2:
			System.out.println("Ram dut hanuman");
			break;
		case 3:
			System.out.println("Rayamana");
			break;
	    default :
	    	System.out.println("wrong age");
			break;
		}
		while(age!=3) {
			System.out.println(age);
		}
	Ram.close();
	}

}
