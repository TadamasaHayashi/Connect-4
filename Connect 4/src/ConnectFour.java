import java.util.Scanner;

public class ConnectFour
	{

		public static void main(String[] args)
			{
				String[][] board = prepareBoard();
				displayBoard(board);
				playGame(board);
				isWonGame(board);
			}
		private static void isWonGame(String[][] board)
			{
				if		
				// Tic tac toe code
				((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
				(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
				(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
				(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
				(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
				(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
				(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
						{
						System.out.println("The game is over!");
						System.exit(0);
						}

				
			}
		private static String[][] prepareBoard()
			{
				String[][] board = new String [6][7];
				
				for (int row = 0; row < board.length; row++ )
					{
					for (int col= 0; col< board[row].length; col++)
						{
						board [row][col] = " ";
						}
					}
				return board;
			}

		private static void displayBoard(String[][] board)
			{
				
				System.out.println("  |  A  |  B  |  C  |  D  |  E  |  F  |  G  | ");
				System.out.println("1 |  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2] + "  |  " + board[0][3] + "  |  " + board[0][4] + "  |  "+ board[0][5] + "  |  "+ board[0][6] + "  | ");
				System.out.println("2 |  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2] + "  |  " + board[1][3] + "  |  " + board[1][4] + "  |  "+ board[1][5] + "  |  "+ board[1][5] + "  | ");
				System.out.println("3 |  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2] + "  |  " + board[2][3] + "  |  " + board[2][4] + "  |  "+ board[2][5] + "  |  "+ board[2][5] + "  | ");
				System.out.println("4 |  " + board[3][0] + "  |  " + board[3][1] + "  |  " + board[3][2] + "  |  " + board[3][3] + "  |  " + board[3][4] + "  |  "+ board[3][5] + "  |  "+ board[3][5] + "  | ");
				System.out.println("5 |  " + board[4][0] + "  |  " + board[4][1] + "  |  " + board[4][2] + "  |  " + board[4][3] + "  |  " + board[4][4] + "  |  "+ board[4][5] + "  |  "+ board[4][5] + "  | ");
				System.out.println("6 |  " + board[5][0] + "  |  " + board[5][1] + "  |  " + board[5][2] + "  |  " + board[5][3] + "  |  " + board[5][4] + "  |  "+ board[5][5] + "  |  "+ board[5][5] + "  | ");
				
				
				
			}
		
		private static void playGame(String[][] board)
			{
			Scanner input= new Scanner (System.in);
			System.out.println("Do you want to play as Xs or Os");
			String currentPlayer = input.nextLine().toUpperCase();
			
			while(!currentPlayer.equals("X") && !currentPlayer.equals("O"))
				{
				System.out.println("Please choose a valid player");
				currentPlayer= input.nextLine().toUpperCase();
				}
			int turns = 0;
			boolean gameWon = false;
			
			while (!gameWon && turns < 42)
				{
					System.out.println("Its player " );
				}
			}
	}
