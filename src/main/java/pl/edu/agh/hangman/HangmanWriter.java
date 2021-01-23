package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanWriter {
	// klasa odpowiedzialna za interakcje/kontakt z userem

	public static void guessWord(ArrayList<String> list) {
		Scanner scanner = new Scanner(System.in);
		boolean keepAsking = true;

		while (keepAsking) {
			System.out.println("guess");
			String guess = scanner.next();
		}

	}

//	Scanner guess = new guess(System.In);
//	System.out.print("Enter word:")
//	String name = in.nextLine();
//	System.out.println("Your guess is" +)

}
