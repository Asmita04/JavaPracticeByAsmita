package assignment.four;
import java.util.Scanner;

public class PrintStringArray_7 {
    public static void main(String[] args) {

        String[] str = new String[4];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<str.length;i++){
            System.out.println("str["+i +"]: ");
            str[i] = scan.nextLine();
        }

        for(String s : str){
            System.out.println(s);
        }
    }
}
