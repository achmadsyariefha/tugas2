import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tictactoeGame {
	public static final int empty = 0;
	public static final int cross = 1;
	public static final int nought = 2;
		
	public static final int playing = 0;
	public static final int draw = 1;
	public static final int crossWon = 2;
	public static final int noughtWon = 3;
	
	public static final int rows = 3, coloumns = 3;
	public static int[][] board = new int [rows][coloumns];
	public static int currentState;
	public static int currentPlayer;
	public static int currentRow, currentColoumn;
	
	public static BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void Menu(){
		System.out.println ("Selamat Datang!!!");
		System.out.println ("Menu Utama");
		System.out.println ("[1] Mulai");
		System.out.println ("[2] Peraturan dan Cara Bermain");
		System.out.println ("[0] Keluar");
	}
	
	public static void RulesAndInstructions(){
		System.out.println("Peraturan Permainan :");
		System.out.println("Terdiri atas dua pemain, setiap pemain memasukkan sebuah karakter kedalam 9 kotak dengan karakter masing masing 'X' atau 'O'");
		System.out.println("Bagi pemain yang memasukkan 3 karaker baik dari atas ke bawah, kiri ke kanan maupun secara diagonal adalah pemenangnya.");
		System.out.println();
		System.out.println("Cara bermain : ");
		System.out.println("Anda tinggal memasukkan 2 buah angka dari 1-3, masing masing untuk baris dan kolom");
	}
	
	public static void intheGame(){
		for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				board[row][coloumn] = empty;
			}
		}
		currentState = playing;
		currentPlayer = cross;
	}
	
	public static void playerMove(int theSeed){
		boolean validInput = false;
		String RowDatainput = null;
		String ColoumnDatainput = null;
		do{
			if (theSeed == cross){
				System.out.print("Player 'X', giliranmu (baris[1-3] kolom[1-3]): ");
			}
			else {
				System.out.print("Player 'O', giliranmu (baris[1-3] kolom[1-3]): ");
			}
			try {
				RowDatainput = bufferedreader.readLine();
				ColoumnDatainput = bufferedreader.readLine();
				try {
					int row = Integer.parseInt(RowDatainput) - 1;
					int coloumn = Integer.parseInt (ColoumnDatainput) - 1;
					if (row >=0 && row < rows && coloumn >= 0 && coloumn < coloumns && board[row][coloumn] == empty){
						currentRow = row;
						currentColoumn = coloumn;
						board[currentRow][currentColoumn] = theSeed;
						validInput = true;
					}
					else {
						System.out.println("Anda memilih (" + (row + 1) + "," + (coloumn + 1) + "), tapi sudah terisi. Coba Lagi...");
					}
				}
				catch (NumberFormatException error) {
                    System.out.println("Masukan Anda Tidak Sesuai");
                }
			}
			catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }
		}
		while (!validInput);
	}
	
	public static void updateGame(int theSeed, int currentRow, int currentColoumn) {
		if (hasWon(theSeed, currentRow, currentColoumn)) {
			currentState = (theSeed == cross) ? crossWon : noughtWon;
		}
		else if (isDraw()) {
			currentState = draw;
		}
	}
	
	public static boolean isDraw() {
		for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				if (board[row][coloumn] == empty){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean hasWon(int theSeed, int currentRow, int currentColoumn) {
		return (board[currentRow][0] == theSeed && board[currentRow][1] == theSeed && board[currentRow][2] == theSeed || board[0][currentColoumn] == theSeed && board[1][currentColoumn] == theSeed && board[2][currentColoumn] == theSeed || currentRow == currentColoumn && board[0][0] == theSeed && board[1][1] == theSeed && board[2][2] == theSeed || currentRow + currentColoumn == 2 && board[0][2] == theSeed && board[1][1] == theSeed && board[2][0] == theSeed);
	}
	
	public static void printBoard() {
		for (int row = 0; row < rows; ++row){
			for (int coloumn = 0; coloumn < coloumns; ++coloumn){
				printCell(board[row][coloumn]);
				if (coloumn != coloumns - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (row != rows - 1) {
				System.out.println("----------");
			}
		}
		System.out.println();
	}
	
	public static void printCell(int content) {
		switch (content) {
			case empty: System.out.print("   ");
			break;
			case nought: System.out.print(" O ");
			break;
			case cross: System.out.print(" X ");
			break;
		}
	}
	
	public static void main (String[] args) {
		bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String dataInput = null;
		int choice = 0;
		intheGame();
		do {
			Menu();
			System.out.println("Masukkan Pilihan Anda : ");
			try {
				dataInput = bufferedreader.readLine();
				try {
					choice = Integer.parseInt(dataInput);
					if (choice > 0 && choice == 1) {
						do {
							playerMove(currentPlayer);
							updateGame(currentPlayer, currentRow, currentColoumn);
							printBoard();
							if (currentState == crossWon) {
								System.out.println("Pemenangnya adalah .... 'X'!");
							}
							else if (currentState == noughtWon) {
								System.out.println("Pemenangnya adalah .... 'O'!");
							}
							else if (currentState == draw) {
								System.out.println("Hasilnya Seri!");
							}
							currentPlayer = (currentPlayer == cross) ? nought : cross;
						}
						while (currentState == playing);
					}
					else if (choice > 0 && choice == 2){
						RulesAndInstructions();
					}
					else {
						System.out.println("Terima Kasih Telah Bermain!!!");
					}
				}
				catch (NumberFormatException e) {
                    System.out.println("Masukan Anda Tidak Sesuai");
				}
			}
			catch (IOException error) {
                System.out.println("Inputan anda Error " + error.getMessage());
            }
		}
		while (choice > 0);
	}
}