package assignment.four;

import java.util.Scanner;

public class EvenNumbers_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scan.nextInt();

        for(int i=0;i<=number;i++){
            if(2*i<=number){
                System.out.println(2*i);
            }
        }
    }
}
