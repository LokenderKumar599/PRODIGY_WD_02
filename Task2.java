import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Random random_number=new Random();	
		int right_guess=random_number.nextInt(1000);
		int turns=0;
		System.out.println("Guess a Number Between 1 to 1000 ,You Will have 10 turns:" );
		System.out.println("BEST OF LUCK !");
		System.out.println("Enter a guessing number from 1 to 1000");
		int guess;
		int i=0;
		boolean win=false;
		while(win==false) {
			guess=sc.nextInt();
			turns++;
			
		if(guess==right_guess) {
			win=true;
		}
		else if(i>8) {
			System.out.println("You LOOSE! the right answer was: " +right_guess);
			sc.close();
			return;
		}
		else if(guess<right_guess) {
			i++;
			System.out.println("You Guess LOWER than the Right guess! Turns Left: " +(10-i));
		}
		else if(guess>right_guess) {
			i++;
			System.out.println("You Guess HIGHER than the Right guess! Turns Left: " +(10-i));
		}
	}     
	System.out.println("YOU WIN!!!");
	System.out.println("Then number was " + right_guess);
	System.out.println("You used " +turns+" turns to guess the right number");
	System.out.println("Your Score is "+((11-turns)*100)+" out of 1000");
	sc.close();
	}
}