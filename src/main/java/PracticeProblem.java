import java.util.Scanner;

public class PracticeProblem {

    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char c = 'a';
        System.out.println(c);
	}

	public static void q2() {
		System.out.print("Input a word: ");
        String word = scanner.nextLine();
        if (word.length() >= 3) {
            char thirdLetter = word.charAt(2);
            System.out.println(thirdLetter);
        } else {
            System.out.println("Word is too short.");
        }
	}

	public static void q3() {
		System.out.print("Input a word: ");
        String word = scanner.nextLine();
        if (word.length() >= 2) {
            char secondChar = word.charAt(1);
            System.out.println("The second character user entered was: " + secondChar);
        } else {
            System.out.println("Word is too short.");
        }
    }

	public static void q4() {
		System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println("Your number plus 1 is: " + (num + 1));
	}

	public static void q5() {
		System.out.print("Input a letter: ");
        String s1 = scanner.nextLine();
        char c1 = s1.charAt(0);
        System.out.print("Input another letter: ");
        String s2 = scanner.nextLine();
        char c2 = s2.charAt(0);

        int sum = c1 + c2;
        System.out.println(sum);
    }    
}



