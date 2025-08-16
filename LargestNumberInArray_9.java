package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberInArray_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int max= 0;

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }

       /* for(int i : array){

            if(i > max ){
                max = i;
            }
        }*/
         max = Arrays.stream(array).max().getAsInt();
        System.out.println("Maximum value : " + max);
    }
}
