public class Min {
    int min;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    A son1 = new A();
    B son2 = new B();
    C son3 = new C();

    public Min(){}
    public Min(int son1, int son2, int son3){

        this.son1.a = son1;
        this.son2.b = son2;
        this.son3.c = son3;
    }

    public int MinValue(){

        int minValue = son1.a;
        if (minValue > son2.b) minValue = son2.b;
        if (minValue > son3.c) minValue = son3.c;
        return minValue;
    }
}