package STRING;


public class String_12_concat {

    public static void main(String args[]) {

        // concat
        String s1 = "java string";
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutables so assign it explicitly");
        System.out.println(s1);
    }
}
