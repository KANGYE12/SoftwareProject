package es.uma.swe;

public class HangmanController {

	private User user;
	private Game game;
	private WordProvider wordProvider;

	public User getUser() {
		return this.user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return this.game;
	}

	/**
	 * 
	 * @param game
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	public WordProvider getWordProvider() {
		return this.wordProvider;
	}

	/**
	 * 
	 * @param wordProvider
	 */
	public void setWordProvider(WordProvider wordProvider) {
		this.wordProvider = wordProvider;
	}

}