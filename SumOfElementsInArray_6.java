package assignment.four;

import java.util.Scanner;

public class SumOfElementsInArray_6 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Output: ");
        for(int i: array){
             sum +=i;
        }
        System.out.println(sum);
    }
}
