package assignment.four;

public class StringPoolWithInternMethod {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = str1.intern();
        String str3 = "hello";

        if(str2 == str3){
            System.out.println("True! str2 and str3 are pointing to same object");
        }else{
            System.out.println("False! str2 and str3 are not pointing to same object");
        }
    }
}
