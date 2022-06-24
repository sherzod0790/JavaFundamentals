package toString;

//Переопределить метод toString() в классе Вох
class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public String toString(){
        return "Размеры " + width + " на "
                + depth + "на" + height + ".";
    }
}

class toStringDemo{

    public static void main(String[] args) {
        Box b = new Box(10,12,14);
        String s = "Объект b типа Вох: " + b;
        // выполнить сцепление символьной строки
        // с объектом типа Вох
        System.out.println(b);
        // преобразовать объект типа Вох в символьную
        // строку при выводе на консоль

        System.out.println(s);
    }
}