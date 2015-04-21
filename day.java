import java.util.Scanner;


public class day {
	public static void main(String[] args){ 
		System.out.println("Enter 0-square, 1-circle: "); 
		int a = new Scanner(System.in).nextInt();
		switch (a){
		case 0:Psquare(); break; 
		case 1:Pcircle(); break;
		default: System.out.println("Out of scope");
		}
	} 
	public static void Psquare(){
		System.out.println("Enter the length of the sides of the square: "); 
		int a = new Scanner(System.in).nextInt();
		System.out.println("Perimeter = " + 4*a);
	}
	public static void Pcircle(){
		System.out.println("Enter the radius of the circle: "); 
		int a = new Scanner(System.in).nextInt();
		System.out.printf("Perimeter = %.2f", 2*a*3.14);
	}
}
