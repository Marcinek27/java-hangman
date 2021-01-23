package pl.edu.agh.hangman;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HangmanGenerator {

	// klasa odpowiedzialna za wczytywanie slowa z pliku
	// file ---> "src/main/resources/slowa.txt"

	public static List<String> appendWordsToList(String path) throws IOException {

		List<String> words = Files.readAllLines(Paths.get(path));
		return words;
//		System.out.println(words);

	}

//	public static void main(String[] args) throws IOException {
//		appendWordsToList("src/main/resources/slowa.txt");
//	}

}
