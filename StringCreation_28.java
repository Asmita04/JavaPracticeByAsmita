package assignment.four;

public class StringCreation_28 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        if(str1 == str2 ){
            System.out.println("Both variables point to the same object: True");
        }
        else {
            System.out.println("Both variables point to the different object: false");
        }

        if(str1.equals(str2)){
            System.out.println("Both string are equal");
        }
        else {
            System.out.println("Both strings are not equal");
        }
    }
}
