package Arrays;

import java.util.Scanner;

public class TicTacToe
{

    private static char[][] board = new char[3][3];
    private static Scanner keyboard = new Scanner(System.in);

    public static void main( String[] args )
    {
        ;

        initBoard();
        displayBoard2();
        int counter=9;
        while (counter<10){
            System.out.println("");
            System.out.print("X, please choose the location: ");
            int first = Integer.parseInt(keyboard.next());
            int second = Integer.parseInt(keyboard.next());
            playerX(first,second);
            counter--;
            displayBoard2();
            if(checkWin()){ break; }
            System.out.print("O, please choose the location: ");
            first = Integer.parseInt(keyboard.next());
            second = Integer.parseInt(keyboard.next());
            playerO(first,second);
            counter--;
            displayBoard2();
            if(checkWin()){ break; }
        }

    }

    public static void playerX(int first, int second){
        if(board[first][second] == ' ') {

            if (first == 0 && second == 0) {
                char x = 'X';
                board[0][0] = x;
            } else if (first == 1 && second == 0) {
                char x = 'X';
                board[1][0] = x;
            } else if (first == 2 && second == 0) {
                char x = 'X';
                board[2][0] = x;
            } else if (first == 0 && second == 1) {
                char x = 'X';
                board[0][1] = x;
            } else if (first == 1 && second == 1) {
                char x = 'X';
                board[1][1] = x;
            } else if (first == 1 && second == 2) {
                char x = 'X';
                board[1][2] = x;
            } else if (first == 2 && second == 1) {
                char x = 'X';
                board[2][1] = x;
            } else if (first == 0 && second == 2) {
                char x = 'X';
                board[0][2] = x;
            } else if (first == 2 && second == 2) {
                char x = 'X';
                board[2][2] = x;
            }
        }else {
            System.out.print("X, please choose the location: ");
            first = Integer.parseInt(keyboard.next());
            second = Integer.parseInt(keyboard.next());
            playerX(first, second);
        }
    }

    public static void playerO(int first, int second){
        if(board[first][second] == ' ') {
            if (first == 0 && second == 0) {
                char x = 'O';
                board[0][0] = x;
            } else if (first == 1 && second == 0) {
                char x = 'O';
                board[1][0] = x;
            } else if (first == 2 && second == 0) {
                char x = 'O';
                board[2][0] = x;
            } else if (first == 0 && second == 1) {
                char x = 'O';
                board[0][1] = x;
            } else if (first == 1 && second == 1) {
                char x = 'O';
                board[1][1] = x;
            } else if (first == 1 && second == 2) {
                char x = 'O';
                board[1][2] = x;
            } else if (first == 2 && second == 1) {
                char x = 'O';
                board[2][1] = x;
            } else if (first == 0 && second == 2) {
                char x = 'O';
                board[0][2] = x;
            } else if (first == 2 && second == 2) {
                char x = 'O';
                board[2][2] = x;
            }
        } else {
            System.out.print("O, please choose the location: ");
            first = Integer.parseInt(keyboard.next());
            second = Integer.parseInt(keyboard.next());
            playerO(first, second);
        }
    }

    static public boolean checkWin() {
        boolean found = false;
        for (int row = 0; row < 1; row++) {
            for (int col = 0; col < 1; col++) {
                if (board[row][col] == 'X' && board[row][col + 1] == 'X' && board[row][col + 2] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row][col] == 'O' && board[row][col + 1] == 'O' && board[row][col + 2] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row][col] == 'X' && board[row + 1][col + 1] == 'X' && board[row + 2][col + 2] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row][col] == 'O' && board[row + 1][col + 1] == 'O' && board[row + 2][col + 2] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row][col + 2] == 'X' && board[row + 1][col + 1] == 'X' && board[row + 2][col] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row][col + 2] == 'O' && board[row + 1][col + 1] == 'O' && board[row + 2][col] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row][col + 1] == 'X' && board[row + 1][col + 1] == 'X' && board[row + 2][col + 1] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row][col + 2] == 'X' && board[row + 1][col + 2] == 'X' && board[row + 2][col + 2] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row + 1][col] == 'X' && board[row + 1][col + 1] == 'X' && board[row + 1][col + 2] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row + 2][col] == 'X' && board[row + 2][col + 1] == 'X' && board[row + 2][col + 2] == 'X') {
                    System.out.println("Player ONE wins . The X have it!");
                    found=true;
                } else if (board[row][col + 1] == 'O' && board[row + 1][col + 1] == 'O' && board[row + 2][col + 1] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row][col + 2] == 'O' && board[row + 1][col + 2] == 'O' && board[row + 2][col + 2] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row + 1][col] == 'O' && board[row + 1][col + 1] == 'O' && board[row + 1][col + 2] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                } else if (board[row + 2][col] == 'O' && board[row + 2][col + 1] == 'O' && board[row + 2][col + 2] == 'O') {
                    System.out.println("Player TWO wins . The O have it!");
                    found=true;
                }
            }
        }
        return found;
    }

    public static void initBoard()
    {
        // fills up the board with blanks
        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }


    public static void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


    public static void displayBoard2()
    {
        for ( int r=0; r<3; r++ )
        {
            System.out.print("\t"+r+" ");
            for ( int c=0; c<3; c++ )
            {
                System.out.print( board[r][c] + " " );
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
}