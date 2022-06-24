package STRING;

/*

 */

public class Main {

    public static void main(String[] args) {

        String name = "Java fundamentals kurs";
        int size = name.length();
        StringBuilder just = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (name.charAt(i) == ' ') {
                System.out.println(just);
                just = new StringBuilder();
            }
            just.append(name.charAt(i));
        }

        System.out.println(name.charAt(1));
    }
}








