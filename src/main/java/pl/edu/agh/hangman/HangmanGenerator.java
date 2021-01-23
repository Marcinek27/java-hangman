package pl.edu.agh.hangman;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HangmanGenerator {
	// klasa odpowiedzialna za wczytywanie slowa z pliku
	// file ---> "src/main/resources/slowa.txt"

<<<<<<< HEAD
	public static List<String> appendWordsToList(String path) throws IOException {

		List<String> words = Files.readAllLines(Paths.get(path));
		return words;
//		System.out.println(words);

=======
	public String newWord(String path) throws IOException {
		List<String> words = appendWordsToList(path);
		WordPicker picker = new RandomWordPicker(words);
		return picker.getWord();
	}
	
	public List<String> appendWordsToList(String path) throws IOException {
		return Files.readAllLines(Paths.get("/src/main/resources/slowa.txt"));
>>>>>>> 87ab987a1a2039eedaa2a6e8c0825a564a9dd20f
	}

//	public static void main(String[] args) throws IOException {
//		appendWordsToList("src/main/resources/slowa.txt");
//	}

}
