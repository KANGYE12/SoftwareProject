package es.uma.swe;

public class Word {

	private char[] word;
	private boolean[] revealedLetters;

	public char[] getWord() {
		return this.word;
	}

	/**
	 * 
	 * @param word
	 */
	public void setWord(char[] word) {
		this.word = word;
	}

	public boolean[] getRevealedLetters() {
		return this.revealedLetters;
	}

	/**
	 * 
	 * @param revealedLetters
	 */
	public void setRevealedLetters(boolean[] revealedLetters) {
		this.revealedLetters = revealedLetters;
	}

	/**
	 * 
	 * @param letter
	 */
	public boolean containsLetter(char letter) {
		// TODO - implement Word.containsLetter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param letter
	 */
	public void displayWord(char letter) {
		// TODO - implement Word.displayWord
		throw new UnsupportedOperationException();
	}

	public void displayInitialWord() {
		// TODO - implement Word.displayInitialWord
		throw new UnsupportedOperationException();
	}

}