package assignment.four;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scan.nextLine();

        char[] chArray = str.toCharArray();


        String ReversedString = "";
        for(int i = chArray.length-1 ;i >=0;i--){
            ReversedString = ReversedString + chArray[i];
        }
        System.out.println(ReversedString);
    }
}
