package assignment.four;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scan.nextInt();

        for(int i = 0; i<=number;i++){
            if(3*i<=number){
                System.out.println(3*i);
            }
        }
    }
}
