package STRING;


public class String_15_split {

    public static void main(String args[]) {

        //  String split()

        String s1 = "java string split method by dasturchi";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
