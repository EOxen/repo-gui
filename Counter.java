/**
 * Java Core. Homework 2.
 *
 * @author Elena Oxenhorn
 * @version 24.10.2021
 */

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        b = arrSize();
        System.out.println();
        String[][] arr = new String[b][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter the value of cell " + (i + 1) + "x" + (j + 1) + " :");
                arr[i][j] = sc.nextLine();
            }
        }
        sc.close();
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        try {
            int r = transferToNumberAndCount(arr);
            System.out.println("Sum of values of all cells: " + r);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    
    public static int arrSize() {
        Scanner size = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int a;
        a = size.nextInt();
        return a;
    }

    public static int transferToNumberAndCount(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].length != 4) {
                throw new MyArraySizeException("Invalid array size!");
            }
            for (int l = 0; l < arr.length; l++) {
                if (arr[l].length != 4) {
                    throw new MyArraySizeException("Invalid array size!");
                }
                try {
                    count += Integer.parseInt(arr[k][l]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException((k + 1), (l + 1));
                }
            }
        }
        return count;
    }
}

class MyArraySizeException extends Throwable {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int row, int col) {
        super(String.format("Incorrect value of cell %dx%d - it cannot be converted to a number.", row, col));
    }
}