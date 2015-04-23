import java.util.Scanner;

//app which can get 2 args and print max value
public class Max_value {
	public static void main(String[] args){ 
		System.out.println("Enter integer number: "); 
		int a = new Scanner(System.in).nextInt();
		System.out.println("Enter integer number: "); 
		int b = new Scanner(System.in).nextInt();
		int max=max(a,b);
		System.out.println("Max value is "+max); 
	} 

	public static int max(int a, int b){
		if (a>=b) return a;
		else return b;
	}
}
