package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted Array : ");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i] + " , ");
        }
    }
}
