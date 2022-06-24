package STRING;


public class String_17_intern {

    public static void main(String args[]) {


        //   String intern()

        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}

