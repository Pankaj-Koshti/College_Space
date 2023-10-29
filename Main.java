package generate;
import java.util.Scanner;
 class PasswordGenerator {	
		public char randomCharacter() {
			int rand = (int)(Math.random()*62);
			if(rand<=9) {
				int ascii= rand+48;
				return (char)(ascii);
			}
			else if(rand<=35) {
				int ascii=rand+55;
				return (char)(ascii);
			}
			else {
				int ascii=rand+61;
				return (char)(ascii);
			}
		}
		public String generator() {
			String randomPassword="";
			for(int i=0;i<8;i++) {
				randomPassword=randomPassword+randomCharacter();
			}
			return randomPassword;
		}
		

	}
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		PasswordGenerator pg=new PasswordGenerator();
		System.out.println("*Welcome to College_Space*");
		System.out.println("Set your details:");
		String username,password;
		System.out.println("1)Username: ");
		username=sc.next();
		System.out.println("2)Password:");
		System.out.println("      i)Create a password: Enter 0");
		System.out.println("      i)Auto generate a password: Enter 1");
		int choice=sc.nextInt();
		if(choice==0) {
			password=sc.next();
		}
		else {
			password=pg.generator();
		}
		System.out.println("Your Credentials are:");
		System.out.println("1)Username: "+username);
		System.out.println("1)Password: "+password);
	}
}



