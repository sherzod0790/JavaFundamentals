package MethodsOverload;

public class _01_OverloadDemo {

    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

}

class Overload{

    public static void main(String[] args) {
        _01_OverloadDemo ob = new _01_OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.5);
        System.out.println("result = " + result);
    }
}
