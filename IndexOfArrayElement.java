package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class IndexOfArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Enter number you want to search: ");
        int search = scan.nextInt();

        Arrays.sort(array);
        int index = Arrays.binarySearch(array,search);
        System.out.println(index>=0?"The number" +search+  "is found at index :" + index:"NotFound" );
    }
}
