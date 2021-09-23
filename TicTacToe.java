/**
 * Java 1. Homework 4.
 *
 * @author Elena Oxenhorn
 * @version 23.09.2021
 */

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final int SIZE = 4;
    final int WIN_SIZE = 4;
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[SIZE][SIZE];
        System.out.println("Game init...");
    }

    void game() {
        System.out.println("Game start");
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTablefull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTablefull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter X Y (1..." + SIZE + "): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        table[x][y] = SIGN_O;
    }

    boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean checkWin(char ch) {
        //check diagonals
        int a = 0;
        int b = 0;
        for (int i = 0; i < SIZE; i++) {
            if (table[i][i] == ch) {
                a = a + 1;
            }
            if (table[i][SIZE - 1 - i] == ch) {
                b = b + 1;
            }
        }
        if (a == SIZE) {
            return true;
        }
        if (b == SIZE) {
            return true;
        }
        // check horizontals
        for (int i = 0; i < SIZE; i++) {
            int c = 0;
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] == ch) {
                    c = c + 1;
                    if (c == SIZE) {
                        return true;
                    }
                }
            }
        }
        // check verticals
        for (int i = 0; i < SIZE; i++) {
            int c = 0;
            for (int j = 0; j < SIZE; j++) {
                if (table[j][i] == ch) {
                    c = c + 1;
                    if (c == SIZE) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean isTablefull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[j][i] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}