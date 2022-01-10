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
	    if(answ){
	    	System.out.println("YOU GUESSED IT!.");
	    }
	    else {
	    	System.out.println("Yikes, try again.");
	    }
	}
}
