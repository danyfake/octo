import java.util.Scanner;

//app for calculating perimeter of square or circle
public class Perimetr {
	public static void main(String[] args){ 
		System.out.println("Enter 0-square, 1-circle: "); 
		int a = new Scanner(System.in).nextInt();
		switch (a){
		case 0:psquare(); break; 
		case 1:pcircle(); break;
		default: System.out.println("Out of scope");
		}
	} 
	//calculating perimeter of square
	public static void psquare(){
		System.out.println("Enter the length of the sides of the square: "); 
		int a = new Scanner(System.in).nextInt();
		int p=4*a;
		System.out.println("Perimeter = " + p);
	}
	//calculating perimeter of circle
	public static void pcircle(){
		System.out.println("Enter the radius of the circle: "); 
		int a = new Scanner(System.in).nextInt();
		double p= 2 * a * 3.14;
		System.out.printf("Perimeter = %.2f", p);
	}
}
