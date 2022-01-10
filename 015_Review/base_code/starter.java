import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Good afternoon traveller, What is your name?");
		String name = sc.nextLine();
		System.out.println ("Hello "+name+"");
		System.out.println("What is your title (ex. tamer of dragons)");
		String title = sc.nextLine();
		System.out.println("Choose your class, Wizard, Warrior, or Rouge, Make sure you capitalize the class :).");
			String choice = sc.nextLine();
			if(choice.equals("Wizard")) 
			{
				System.out.println("I see you have chosen Wizard");
			}
			if(choice.equals("Warrior")) 
			{
				System.out.println("You picked Warrior");
			}
			if(choice.equals("Rouge")) 
			{
				System.out.println("You seriously chose rouge?");
			}
			
			System.out.println("Right, now that we have that sorted you have 25 points to spend into various traits: Strength, Dexterity, Intelligence, Constitution and Charisma. Pick Wisely.");
			int Max = 25;
			System.out.println("How many Strength points would you like?");
			int strength = sc.nextInt();
			if(strength>=1){
				if(strength<=10){
					System.out.println("great you have "+strength+" points into strength");
				}
				else {
					System.out.println("sorry traveller only 10 points per trait, try again next time");
					return;
				}
			}
			System.out.println("You have "+((Max)-strength)+" points remaining");
			
			System.out.println("How many Dexterity points would you like?");
			int dexterity = sc.nextInt();
			if(dexterity>=1) {
				if(dexterity<=10){
					System.out.println("great you have "+dexterity+" points into dexterity");
				}
				else {
					System.out.println("sorry traveller only 10 points per trait, try again next time");
					return;
				}
					System.out.println("You have "+((Max)-strength-dexterity)+" points remaining");
			}
			System.out.println("How many Intelligence points would you like?");
			int intelligence= sc.nextInt();
			if(intelligence>=1){
				if(intelligence<=10) {
					System.out.println("great you have "+intelligence+ " points into dexterity");
				}
				else{
					System.out.println("sorry traveller only 10 points per trait, try again next time");
					return;
				}
				System.out.println("You have "+((Max)-strength-dexterity-intelligence)+" points remaining");
			}
			System.out.println("How many Constitution points would you like?");
			int constitution = sc.nextInt();
			if(constitution>=1){
				if(constitution<=10){
					System.out.println("great you have "+constitution+" points into dexterity");
				}
				else{
					System.out.println("sorry traveller only 10 points per trait, try again next time");
					return;
				}
				System.out.println("You have "+((Max)-strength-dexterity-intelligence-constitution)+" points remaining");
			}
		    System.out.println("How many Charisma points would you like?");
		    int charisma = sc.nextInt();
		    if(charisma>=1){
		    	if(charisma<=10){
		    		System.out.println("great you have "+charisma+" points into charisma");
		    	}
		        else{
		        	System.out.println("sorry traveller only 10 points per trait, try again next time");
					return;
		        }
		    }
		   System.out.println("You are "+name+" "+title+" the "+choice+"");
	       System.out.println("You put "+strength+" points into strength.");
	       System.out.println("You put "+dexterity+" points into dexterity.");
	       System.out.println("You put "+intelligence+" points into intelligence.");
	       System.out.println("You put "+constitution+" points into constitution.");
	       System.out.println("You put "+charisma+" points into charisma.");
	}
}
