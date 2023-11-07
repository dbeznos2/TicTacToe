
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        initializeBoard(board);
        printBoard(board);
        int moves = 0;

        while (moves < 9) {
            int move = getPlayerMove(board, currentPlayer);
            int row = (move - 1) / 3;
            int col = (move - 1) % 3;

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                printBoard(board);

                if (checkWin(board, currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                moves++;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Please choose an empty cell.");
            }
        }
        if (moves == 9) {
            System.out.println("It's a draw!");
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) { //rows
            for (int j = 0; j < 3; j++) { //columns
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
        int row, col;

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
            move = scanner.nextInt();
            row = (move - 1) / 3;
            col = (move - 1) % 3;

            if (move >= 1 && move <= 9 && board[row][col] == ' ') {
                break;
            } else {
                System.out.println("Invalid move. Please choose an empty cell.");
            }
        }

        return move;
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check for horizontal wins
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check for vertical wins
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check for diagonal wins
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Diagonal win (top-left to bottom-right)
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Diagonal win (top-right to bottom-left)
        }
        return false; // No win
    }
}







