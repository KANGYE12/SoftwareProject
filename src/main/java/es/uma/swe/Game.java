package es.uma.swe;

import es.uma.swe.Word;

import java.util.Set;

public class Game {

	private Word currentWord;
	private Set<Character> guessedLetters;
	private int remainingAttempts;
	private boolean isGameWon;
	private boolean isGameOver;

	public Word getCurrentWord() {
		return this.currentWord;
	}

	/**
	 * 
	 * @param currentWord
	 */
	public void setCurrentWord(Word currentWord) {
		this.currentWord = currentWord;
	}

	public Set<Character> getGuessedLetters() {
		return this.guessedLetters;
	}

	/**
	 * 
	 * @param guessedLetters
	 */
	public void setGuessedLetters(Set<Character> guessedLetters) {
		this.guessedLetters = guessedLetters;
	}

	public int getRemainingAttempts() {
		return this.remainingAttempts;
	}

	/**
	 * 
	 * @param remainingAttempts
	 */
	public void setRemainingAttempts(int remainingAttempts) {
		this.remainingAttempts = remainingAttempts;
	}

	public boolean getIsGameWon() {
		return this.isGameWon;
	}

	public boolean getIsGameOver() {
		return this.isGameOver;
	}

	/**
	 * 
	 * @param letter
	 */
	public boolean guessLetter(char letter) {
		// TODO - implement Game.guessLetter
		throw new UnsupportedOperationException();
	}

}