import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What should x be?");
		int x=sc.nextInt();
			System.out.println("What should y be?");
		int y=sc.nextInt();
			System.out.println("What should z be?");
		int z=sc.nextInt();
		
		boolean x1 = ((x>y) && (x>z));
		boolean x2 = ((y>x) && (y>z));
		boolean x3 = ((z>x) && (z>y));
		boolean x4 = ((x<y) && (x<z));
		boolean x5 = ((y<x) && (y<z));
		boolean x6 = ((z<x) && (z<y));
		if(x1) {
			System.out.println("X is the biggest number");
		}
		if(x2) {
			System.out.println("Y is the biggest number");
		}
		if(x3) {
			System.out.println("Z is the biggest number.");
		}
		if(x4) {
			System.out.println("x is the smallest number.");
		}
		if(x5) {
			System.out.println("y is the smallest number.");
		}
		if(x6) {
			System.out.println("z is the smallest number.");
		}
	}
}
