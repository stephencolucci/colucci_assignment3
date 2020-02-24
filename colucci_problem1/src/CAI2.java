
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {

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
		SecureRandom rnd1 = new SecureRandom();
		int RAND = rnd1.nextInt(5);
		switch(RAND) {
		case 1:
			System.out.println("Very Good!");
			break;
		case 2:
			System.out.println("Excelent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}

	public static void displayIncorrectResponse(){
		SecureRandom rnd2 = new SecureRandom();
		int RND = rnd2.nextInt(5);
		switch(RND) {
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}
	}
}
