package STRING;


public class String_10_equals {

    public static void main(String args[]) {

        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(s4));//false
    }
}
