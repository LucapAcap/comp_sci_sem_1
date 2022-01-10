import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
    System.out.println("What is your name?");
    String name=sc.nextLine(); 
    
    System.out.println("What month were you born (in letters :D) ");
    String month=sc.nextLine();
    
    System.out.println("What day were you born?");
    int day=sc.nextInt();
    
    System.out.println("What year were you born?");
    int year=sc.nextInt();
    
    System.out.println("How old are you?");
    int age=sc.nextInt();
    
    System.out.println("How much is a buck fifty in numbers?");
    double money=sc.nextDouble();
    
	}
}
