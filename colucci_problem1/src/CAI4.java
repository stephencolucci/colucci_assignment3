import java.util.Scanner;
import java.security.SecureRandom;

public class CAI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
quiz();
	}
	public static void quiz(){
		SecureRandom rnd = new SecureRandom();
		Scanner sc=new Scanner(System.in);
		int a = 1;
		int b = 0;
		int c = 0;
		int difficulty = readDifficulty(sc);
		
		while(a<=10) {
			int multiplicand = generateQuestionArguement(rnd, difficulty);
			int multiplier = generateQuestionArguement(rnd, difficulty);
			int ans = askQuestion(multiplicand, multiplier);
			int ANS = readResponse();
			if(ans == ANS) {
				displayCorrectResponse();
				b++;
			}
			else {
			displayIncorrectResponse();
			c++;
			}
			a++;
		}
		displayCompletionMessage(b);
		System.out.println("Solve a new problem, Y or N?");
		char ch=sc.next().charAt(0);
		if(ch == 'Y')
			quiz();
		else
			System.exit(0);
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
	
public static void displayCompletionMessage(int x) {
	float percent = (float)x/10 * 100;
	System.out.println("Final score: "+percent+"%");
	if(percent >= 75)
		System.out.println("Congratulations, you are ready to go to the next level!");
	else
		System.out.println("Please ask your teacher for extra help.");
	}
public static int generateQuestionArguement(SecureRandom rnd, int difficultylvl){
	int arguement = 0;
	
	if(difficultylvl == 1)
		arguement = rnd.nextInt(10);
	else if(difficultylvl == 2)
		arguement = rnd.nextInt(100);
	else if(difficultylvl == 3)
		arguement = rnd.nextInt(1000);
	else
		arguement = rnd.nextInt(10000);
	
	return arguement;
	}

public static int readDifficulty(Scanner sc){
	System.out.println("Enter a difficulty level from 1-4:");
	return sc.nextInt();
	}
}