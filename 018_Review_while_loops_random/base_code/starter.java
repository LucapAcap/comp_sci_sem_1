import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int numb;
    numb=(1);
    int rand1 = rand.nextInt(1000);
    int randnum = numb+rand1;
    Math.random();
    int guess;
     do {
    System.out.print("Enter a guess: ");
    guess = sc.nextInt();
    System.out.println("Your guess is " + guess);
    if (guess == randnum)
     System.out.println("Your guess is correct. Congratulations!");
    else if (guess < randnum)
    System.out.println("Your guess is smaller than the secret number.");
    else if (guess > randnum)
    System.out.println("Your guess is greater than the secret number.");
     } while (guess != randnum);

	}
}
