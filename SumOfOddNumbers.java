package assignment.four;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scan.nextInt();
        int sum = 0;
        for(int i=1;i<=number;i++){
         if(i%2 !=0){
             System.out.println(sum);
             sum += i;
         }

        }
        System.out.println("The sum of odd numbers from 1 to "+ number + " is: " + sum );
    }
}
