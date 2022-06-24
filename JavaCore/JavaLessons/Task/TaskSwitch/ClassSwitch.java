import java.util.Scanner;

public class ClassSwitch {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        A son1 = new A();
        B son2 = new B();
        C son3 = new C();
        Max max = new Max();
        Min min = new Min();
        ClassSort sortirovka = new ClassSort();

        System.out.println("Ixtiyoriy 3 xonali butun turdagi son kiriting!");


        System.out.print("a = "); son1.setA(scan.nextInt()); System.out.println();
        System.out.print("b = "); son2.setB(scan.nextInt()); System.out.println();
        System.out.print("c = "); son3.setC(scan.nextInt()); System.out.println();

        System.out.println("Shartlarni tanlang! \n1 - Maximum qiymat \n2 - Minumum qiymat \n3 - Sortirovka qilish");
        int son = scan.nextInt();

        switch (son){

            case 1: {max = new Max(son1.a, son2.b, son3.c);
                System.out.println(max.MaxValue()); break;}
            case 2: {min = new Min(son1.a, son2.b, son3.c);
                System.out.println(min.MinValue()); break;}
            case 3: {sortirovka = new ClassSort(son1.a, son2.b, son3.c);
                sortirovka.SortValue(); break;}
            default:
                System.out.println("Ma'lumotni to'g'ri kiriting!");

        }







    }
}