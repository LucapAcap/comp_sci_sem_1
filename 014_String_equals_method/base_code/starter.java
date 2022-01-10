import java.util.Scanner;
import java.util.Random;                         

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your class, Wizard, Warrior, or Rouge, Make sure you capitalize the class :).");
			String choice = sc.nextLine();
			if(choice.equals("Wizard")) 
			{
				System.out.println("I see you have chosen Wizard, what are you a nerd or something?");
			}
			if(choice.equals("Warrior")) 
			{
				System.out.println("You picked Warrior, you're cool i guess.");
			}
			if(choice.equals("Rouge")) 
			{
				System.out.println("Yuck you picked rouge? FR?");
			}
			else 
			{
				System.out.println("This is so embarassing for you, next time pick an actual class.");
			}
	}
}
