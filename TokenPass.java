package project;

import java.util.Random;

// The Token Pass game is represented by the TokenPass class.
public class TokenPass {
	private int[] board;
	private int currentPlayer;

	public static void main(String[] args) {
		TokenPass tp = new TokenPass(10);
		tp.distributeCurrentPlayerTokens();
	}

	/**
	 * Creates the board array to be of size playerCount and fills it with random integer values from 1 to 10,
	 * inclusive. Initializes currentPlayer to a random integer value in the range between 0 and playerCount-1,
	 * inclusive.
	 * 
	 * @param playerCount
	 *            the number of players
	 */
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		Random r = new Random();
		for (int i = 0; i < playerCount; i++) {
			int rand = r.nextInt(10);
			if (rand != 0) {
				board[i] = rand;
			} else {
				board[i] = 1;
			}

		}

		currentPlayer = r.nextInt(playerCount);

		/* to be implemented in part (a) */ }

	/**
	 * Distributes the tokens from the current player's position one at a time to each player in the game. Distribution
	 * begins with the next position and continues until all the tokens have been distributed. If there are still tokens
	 * to distribute when the player at the highest position is reached, the next token will be distributed to the
	 * player at position 0. Precondition: the current player has at least one token. Postcondition: the current player
	 * has not changed.
	 */
	public void distributeCurrentPlayerTokens() {
		/* to be implemented in part (b) */
		// printing

		System.out.println("Original: ");
		for (int i = 0; i < board.length; i++) {
			System.out.print(board[i] + ", ");
		}
		// \printing
		int tokens = board[currentPlayer];
		int pt = tokens;
		int i = currentPlayer;
		int pi = i;
		board[i] = 0;
		i++;
		while (tokens != 0) {
			board[i]++;
			tokens--;
			i++;
			if (i == board.length) {
				i = 0;
			}
		}

		// printing
		System.out.println("\n" + "New: ");
		for (int j = 0; j < board.length; j++) {
			System.out.print(board[j] + ", ");
		}
		System.out.println("\n" + "Start  = " + pi);
		System.out.println("\n" + "Tokens = " + pt);
		// \printing
	}
	// There may be instance variables, constructors, and methods that are not shown.
}
