import java.util.Scanner;

//вычисление периметра квадрата и круга
public class perimetr {
	public static void main(String[] args){ 
		System.out.println("Enter 0-square, 1-circle: "); 
		int a = new Scanner(System.in).nextInt();
		switch (a){
		case 0:Psquare(); break; 
		case 1:Pcircle(); break;
		default: System.out.println("Out of scope");
		}
	} 
	//вычисление периметра квадрата
	public static void Psquare(){
		System.out.println("Enter the length of the sides of the square: "); 
		int a = new Scanner(System.in).nextInt();
		int p=4*a;
		System.out.println("Perimeter = " + p);
	}
	//вычисление периметра круга
	public static void Pcircle(){
		System.out.println("Enter the radius of the circle: "); 
		int a = new Scanner(System.in).nextInt();
		double p= 2 * a * 3.14;
		System.out.printf("Perimeter = %.2f", p);
	}
}
