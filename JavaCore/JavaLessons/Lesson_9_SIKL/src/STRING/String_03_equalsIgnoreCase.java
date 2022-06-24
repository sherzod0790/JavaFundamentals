package STRING;

// Java String replace(CharSequence target, CharSequence replacement)

public class String_03_equalsIgnoreCase {

    public static void main(String args[]) {
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        String s5 = "jAVATPOINt";
        System.out.println(s1.equalsIgnoreCase(s2));//to'g'ri, chunki mazmun va holat ikkalasi bir xil
        System.out.println(s1.equalsIgnoreCase(s3));//rost, chunki hodisa e'tiborga olinmaydi
        System.out.println(s1.equalsIgnoreCase(s4));//noto'g'ri, chunki kontent bir xil emas
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
