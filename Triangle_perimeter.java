import java.util.Scanner;

//app for calculating perimeter of figures triangle,
public class Triangle_perimeter {
	public static void main(String[] args){ 
		
		System.out.print("Enter the length of trianle: a="); 
		int a = new Scanner(System.in).nextInt();
		System.out.print("b="); 
		int b = new Scanner(System.in).nextInt();
		System.out.print("c="); 
		int c = new Scanner(System.in).nextInt();
		
		//check Triangle inequality
		if (proverka(a,b,c) == true)
		{
			int p=a+b+c;
			System.out.println("Triangle perimetr = " + p);
		}
		else System.out.println("Not a triangle");
	} 
	
	public static boolean proverka(int a, int b, int c){
		if (a>0 & b>0 & c>0 & a<(b+c) & b<(c+a) & c<(a+b))
			return true;
		else return false;
	}
}
