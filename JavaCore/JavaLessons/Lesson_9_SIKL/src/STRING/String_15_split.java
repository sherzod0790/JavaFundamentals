package STRING;


public class String_15_split {

    public static void main(String args[]) {

        //  String split()

        String s1 = "java, string: split method by dasturchi";

//        String[] words = s1.split("\\s");
//        String[] words = s1.split(" ", 3); // limit nechta satr pastga tushishi
        String[] words = s1.split(" ", -2); // limit nechta satr pastga tushishi

        for (String w : words) {
            System.out.println(w);
        }

        System.out.println(words[0]);
    }
}
