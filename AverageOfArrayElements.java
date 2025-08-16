package assignment.four;

import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int sum =0;

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }
        for(int i: array){
            sum +=i;
        }
        System.out.println("The average of the numbers is:" + sum/5);


    }
}
