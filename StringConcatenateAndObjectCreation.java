package assignment.four;

public class StringConcatenateAndObjectCreation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1 + str2;

        if(str3==str1){
            System.out.println("True! str3 pointing to the same object as str1");
        }
        else {
            System.out.println("False! str3 is not pointing to the same object as str1 ");
        }
    }
}
