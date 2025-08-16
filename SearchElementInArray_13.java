package assignment.four;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchElementInArray_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[5];

        for(int i =0;i<array.length;i++){
            System.out.println("Enter value for array[" + i+"]: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Enter number you want to search: ");
        int search = scan.nextInt();
        List<Integer>  list = Arrays.asList(array);

        System.out.println( list.contains(search) ? "Found": "Not Found");
    }
}
