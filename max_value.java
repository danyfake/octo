import java.util.Scanner;


public class max_value {
	public static void main(String[] args){ 
		System.out.println("Enter integer number: "); 
		int a = new Scanner(System.in).nextInt();
		System.out.println("Enter integer number: "); 
		int b = new Scanner(System.in).nextInt();
		if (a<b){
			System.out.println("Max value is "+b);}
		else {if (a>b){
			System.out.println("Max value is "+a);}
		else {System.out.println("omg they're equal");}
		}
	} 
}
