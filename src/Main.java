import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int columns, rows;
        int[][] array;
        System.out.print("Enter columns number: ");
        columns = input.nextInt();
        System.out.print("Enter rows number: ");
        rows = input.nextInt();
        array = new int[columns][rows];
        System.out.println("Enter value of elements:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Array:" + Arrays.deepToString(array));
        System.out.println("Sum of numbers in a column: " + total(array));
    }
    public static int total(int[][] arr) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int index;
        System.out.println("Enter the column you want to sum: ");
        index = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][index - 1];
            }
        return sum;
    }
}