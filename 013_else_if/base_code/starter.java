import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int x = rand.nextInt(1001);
		System.out.println("Pick a number between 1-1000");
		int y = sc.nextInt(); 
		boolean answ = x == y;
		boolean answ2 = x<y;
		boolean answ3 = x>y;
		if(answ){
			System.out.println("NICE JOB YOU GOT IT");
		}
		else if(answ2){
			System.out.println("TOO HIGH");
		}
		else if(answ3) {
			System.out.println("TOO LOW");
		}
			
	}
}
