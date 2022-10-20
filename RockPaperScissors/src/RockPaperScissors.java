import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		String[] rps = {"r","p","s"};
		String computerTurn = rps[new Random().nextInt(rps.length)];
		
		
		String playerTurn;
		
		while(true) {
		System.out.println("Please enter your move(r,p,s)");
		playerTurn = scanner.nextLine();
		if(playerTurn.equals("r")||playerTurn.equals("p")||playerTurn.equals("r")) {
			break;
		}
		System.out.println(playerTurn +"is not a valid move.");

	}
		System.out.println("Computer played:" + computerTurn);
		
		if(playerTurn.equals(computerTurn)) {
			System.out.println("The game is a tie!");
		}
		else if(playerTurn.equals("r")) {
			if(computerTurn.equals("p")) {
				System.out.println("You lose!");
			}
			else if(computerTurn.equals("s")) {
				System.out.println("You win!");
			}
			else if(computerTurn.equals("r")) {
				System.out.println("You lose!");
			}
			
		}
		else if(playerTurn.equals("p")) {
			if(computerTurn.equals("r")) {
				System.out.println("You win!");
			}
			else if(computerTurn.equals("s")) {
				System.out.println("You win!");
			}
		}
		else if(playerTurn.equals("s")) {
			if(computerTurn.equals("r")) {
				System.out.println("You lose!");
			}
			else if(computerTurn.equals("p")) {
				System.out.println("You win!");
			}
		}
			
		System.out.println("Play again?(y/n)");
		String playAgain = scanner.nextLine();
		if(!playAgain.equals("y")) {
			break;
		}
		
		scanner.close();

}
}
}