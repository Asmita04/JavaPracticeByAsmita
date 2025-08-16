package assignment.four;

import java.util.Scanner;

public class PrintElementOfArray_5 {
    public static void main(String[] args) {

       int[] array = new int[5];
       Scanner scan = new Scanner(System.in);

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }

        for(int i =0;i<array.length;i++){
            System.out.println("array[" + i+"]: "+array[i]);
        }
    }
}

