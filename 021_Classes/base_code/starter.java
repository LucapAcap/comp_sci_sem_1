 import java.util.Scanner;
import java.util.Random;
class Character {
	String role = new String("Warrior");
	int dex = 5;
    int str = 5;
    int intel = 5;
    int cha = 5;
    int con = 5;
}   
class starter {
	public static void main(String args[]) {
	Character playerChar = new Character();
	System.out.println(playerChar.role);
	System.out.println("dexterity is "+playerChar.dex+"");
    System.out.println("strength is "+playerChar.str+"");
    System.out.println("intelligence "+playerChar.intel+"");
    System.out.println("Charisma is "+playerChar.cha+"");
    System.out.println("Constitution is "+playerChar.con+"");
	}
}
