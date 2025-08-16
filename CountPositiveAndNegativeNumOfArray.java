package assignment.four;

import java.util.Scanner;

public class CountPositiveAndNegativeNumOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];
        int postivieNumCount = 0;
        int negativeNumCount = 0;

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }

        for(int i : array){
            if(i<0){
                negativeNumCount++;
            } else{
                postivieNumCount ++;
            }

        }
        System.out.println("Positive numbers are: " + postivieNumCount);
        System.out.println("Negative numbers are: " + negativeNumCount);
    }
}
