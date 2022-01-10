import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ayo quick give me a name.");
	String name = sc.nextLine();
	System.out.println("aight now how many times do you want me to repeat it");
	int times= sc.nextInt();
	int a=1;
	while(true){
		System.out.println(name);
		if(a==times){
			break;
		}
        a=a+1;
	}
	}
}
	
