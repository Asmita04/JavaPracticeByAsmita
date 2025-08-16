package assignment.four;

import java.util.Scanner;

public class FactorialOfNumber {
    public int factorial(int num){
        if(num==1 || num==0){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();

        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
        System.out.println("Factorial of given number is: "+ factorialOfNumber.factorial(num));
    }

}
