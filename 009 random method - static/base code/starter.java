import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand_num1= rand.nextInt(9);
		System.out.println(rand_num1);
		
		int a=1;
		int rand_num2 = rand.nextInt(100);
		System.out.println(a+rand_num2);
		
		double b=2.5;
		double rand_num3 = rand.nextDouble()+2.5;
		System.out.println(rand_num3);
		
		double c=14;
		double rand_num4 = rand.nextDouble()+588;
		System.out.println(rand_num4);
	}
}
