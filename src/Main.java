
import java.util.Scanner; // Import the Scanner class from the java.util package.

public class Main { // Define a class named "TicTacToe."
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        initializeBoard(board);
        printBoard(board);
        int moves = 0;

    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
    public static int getPlayerMove(char[][] board, char currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        int move;

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
            move = scanner.nextInt();
            if (move >= 1 && move <= 9) {
                int row = (move - 1) / 3;
                int col = (move - 1) % 3;
                if (board[row][col] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Please choose an empty cell.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
            }
        }

        return move;
    }


}





