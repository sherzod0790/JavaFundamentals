package STRING;

// Java String replace(CharSequence target, CharSequence replacement)

public class String_02_replace {

    public static void main(String args[]) {
        String s1 = "my name is khan my name is java";
        String replaceString = s1.replace("is", "was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);


    }
}
