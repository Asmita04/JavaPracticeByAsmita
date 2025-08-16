package assignment.four;

public class MultipleStringWithSameContent {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        if(str1 == str2 && str2== str3){
            System.out.println("True! All string are pointing to same object");
        }else{
            System.out.println("False! Not all strings are pointing to same object");
        }
    }
}
