package assignment.four;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PrintNumbers_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scan.nextInt();

        for(int i= 1;i<=number;i++){
            System.out.println(i);
        }
    }
}
