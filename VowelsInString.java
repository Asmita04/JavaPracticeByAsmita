package assignment.four;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scan.nextLine();
        int count = 0;
        String[] arrayOfVowels = {"a","e","i","o","u"};
        str = str.toLowerCase();

       for(int i = 0;i< str.length();i++){
           char ch  =  str.charAt(i);

           if(ch == 'a'|| ch == 'e'|| ch=='i'|| ch=='o'||ch=='u'){
               count++;
           }
       }
        System.out.println("The number of vowels in string are: " + count);
    }
}
