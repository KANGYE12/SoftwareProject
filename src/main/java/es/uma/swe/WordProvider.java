package es.uma.swe;

import java.util.List;

public class WordProvider {

	private List<String> wordList;

	public List<String> getWordList() {
		return this.wordList;
	}

	/**
	 * 
	 * @param wordList
	 */
	public void setWordList(List<String> wordList) {
		this.wordList = wordList;
	}

	public Word getRandomWord() {
		// TODO - implement WordProvider.getRandomWord
		throw new UnsupportedOperationException();
	}

}