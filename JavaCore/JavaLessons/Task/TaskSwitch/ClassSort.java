public class ClassSort {

    A son1 = new A();
    B son2 = new B();
    C son3 = new C();


    public ClassSort() {}

    public ClassSort(int son1, int son2, int son3) {
        this.son1.a = son1;
        this.son2.b = son2;
        this.son3.c = son3;
    }



    public void SortValue() {

        Max max = new Max(son1.a, son2.b, son3.c);
        Min min = new Min(son1.a, son2.b, son3.c);

        if (max.MaxValue() > son2.b && son2.b > min.MinValue())
            System.out.println("Minumum qiymat = " + min.MinValue() + " O'rta qiymat = " + son2.b + " Maksimum qiymat = " + max.MaxValue());
        if (max.MaxValue() > son3.c && son3.c > min.MinValue())
            System.out.println("Minumum qiymat = " + min.MinValue() + " O'rta qiymat = " + son3.c + " Maksimum qiymat = " + max.MaxValue());
        if (max.MaxValue() > son1.a && son1.a > min.MinValue())
            System.out.println("Minumum qiymat = " + min.MinValue() + " O'rta qiymat = " + son1.a + " Maksimum qiymat = " + max.MaxValue());
    }
}
