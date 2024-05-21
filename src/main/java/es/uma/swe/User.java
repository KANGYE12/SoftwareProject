package es.uma.swe;
import java.time.LocalDate;

public class User {

	private String username;
	private LocalDate lastPlayedDate;
	private int attempts;

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getLastPlayedDate() {
		return this.lastPlayedDate;
	}

	/**
	 * 
	 * @param lastPlayedDate
	 */
	public void setLastPlayedDate(LocalDate lastPlayedDate) {
		this.lastPlayedDate = lastPlayedDate;
	}

	public int getAttempts() {
		return this.attempts;
	}

	/**
	 * 
	 * @param attempts
	 */
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

}