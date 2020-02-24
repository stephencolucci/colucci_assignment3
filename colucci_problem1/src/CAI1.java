
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
quiz();
	}
	public static void quiz(){
		SecureRandom rnd = new SecureRandom();
		int multiplicand = rnd.nextInt(10);
		int multiplier = rnd.nextInt(10);
		while(true) {
			int ans = askQuestion(multiplicand, multiplier);
			int ANS = readResponse();
			if(ans == ANS) {
				displayCorrectResponse();
				break;
			}
			displayIncorrectResponse();
		}
	}

	public static int askQuestion(int multiplicand, int multiplier){
		System.out.println("How much is " +multiplicand+ " times " +multiplier);
		return multiplicand * multiplier;
	}

	public static int readResponse(){
		Scanner input = new Scanner(System.in);
		int ans = input.nextInt();
		return ans;
	}

	public static boolean isAnswerCorrect(int ans, int ANS){
		if(ans == ANS) {
			return true;
		}
		return false;
	}

	public static void displayCorrectResponse(){
		System.out.println("Very Good!");
		}

	public static void displayIncorrectResponse(){
		System.out.println("No. Please try again.");
		}
}
