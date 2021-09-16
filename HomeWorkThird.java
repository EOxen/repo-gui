/**
 * Java 1. Homework 3.
 *
 * @author Elena Oxenhorn
 * @version 16.09.2021
 */
 
import java.util.Arrays;

class HomeWorkThird {
    public static void main (String[] args) {
        int[] arr1 = { 1, 1, 0, 1, 0, 0, 1 };
        invertArray(arr1);
        fillArray(100);
        int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        changeArray(arr2);
        fillDiagonal(7);
        initValue(5, 8);
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 8, 9, 1 };
        minMaxValueSort(arr3);
        minMaxValue(arr3);
        int[] arr4 = { 2, 2, 1, 2, 0, 1, 2 };
        int[] arr5 = { 1, 5, 3, 2, 11, 4, 8, 9, 15 };
        System.out.println(rightLeftsum(arr4));
        System.out.println(rightLeftsum(arr5));
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i || j == arr.length - i - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void initValue(int len, int initialValue) {
        int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
        System.out.println(Arrays.toString(arr));
    }

/*вариант с сортировкой массива*/
    public static void minMaxValueSort(int[] arr) {
        Arrays.sort (arr);
        System.out.println("Min" + " " + arr[0]);
        int x = arr.length-1;
        System.out.println("Max" + " " + arr[x]);
    }

/*вариант без сортировки массива*/
    public static void minMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min" + " " + min);
        System.out.println("Max" + " " + max);
    }

    public static boolean rightLeftsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int leftsum = 0;
        for (int i = 0; leftsum < sum - leftsum; i++) {
            leftsum = leftsum + arr[i];
        }
        return leftsum == (sum - leftsum);
    }
}