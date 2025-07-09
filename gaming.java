package project;
import java.util.Random;
import java.util.Scanner;
public class gaming{
	public static void main(String args[]) {
		Random no=new Random();
		Scanner value=new Scanner(System.in);
		int a=no.nextInt(100)+1;
		int attempts=0;
		while(true) {
			System.out.print("Enter a number to guess:");
			int b=value.nextInt();
			int guess=attempts++;
			System.out.println(guess);
			if(a<b) {
				System.out.println("The number is high");
			}
			else if(a>b) {
				System.out.println("The number is low");
			}
			else {
				System.out.println("Your guess is correct");
				break;
			}
		}
	}
}