package pl.edu.agh.hangman;

import java.util.ArrayList;

public class Hangman {

<<<<<<< HEAD
	public static final String[] HANGMANPICS = new String[] {
			"  +---+\n" + "  |   |\n" + "      |\n" + "      |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + "      |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + "  |   |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|   |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " /    |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " / \\  |\n" + "      |\n" + "========" };

	public static void main(String[] args) throws Exception {
		System.out.println(HANGMANPICS[0]);
		HangmanWriter writer = new HangmanWriter();
		HangmanGenerator list = new HangmanGenerator();
		
//		ArrayList<String> 

		list.appendWordsToList("src/main/resources/slowa.txt");

//		writer.guessWord(list);

	}
=======
	public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

	// Max errors before user lose
	public static final int MAX_ERRORS = 8;
	// Word to find
	private static String wordToFind;
	// Word found stored in a char array to show progression of user
	private static char[] wordFound;
	private static int numErrors;
	// letters already entered by user
	private static ArrayList<String> letters = new ArrayList<>();

	private static final String path = "src/resources/slowa.txt";

	public static void main(String[] args) {
		System.out.println("Hangman Game)");
		
	}

>>>>>>> 87ab987a1a2039eedaa2a6e8c0825a564a9dd20f
}
