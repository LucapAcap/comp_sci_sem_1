import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What should x be?");
		int x=sc.nextInt();
	
		System.out.println("What should y be?");
		int y=sc.nextInt();

		boolean Luca = x == y;
		if(Luca)
		{
			System.out.println("WOW THESE ARE EQUAL!");
		}
		boolean Ace=x!=y;
		if(Ace)
		{
			System.out.println("THESE ARE NOT EQUAL!");
		}
	}
}