
public class Max {
    int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    A son1 = new A();
    B son2 = new B();
    C son3 = new C();


public Max(){}

    public Max(int son1, int son2, int son3){

        this.son1.a = son1;
        this.son2.b = son2;
        this.son3.c = son3;
    }

    public int MaxValue(){

        int maxValue = son1.a;
        if (maxValue < son2.b) maxValue = son2.b;
        if (maxValue < son3.c) maxValue = son3.c;
        return maxValue;
    }
}