import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

    static void P(String s) {

        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\user\\Documents\\Test.txt");
        Date da = new Date();
        try {
            if (f1.createNewFile()) {

                P("Faylning nomi: " + f1.getName());
                P("Faylga yo'l: " + f1.getPath());
                P(f1.exists() ? "Mavjud" : "Mavjud emas");
                P("Fayl o'zgartirilgan sana va vaqt: " + f1.lastModified());
                P("Fayl o'zgartirilgan sana va vaqt:" + da.toString());
                P("O'lchovi: " + f1.length() + " bayt");
                P("Fayl joylashgan katalog: " + f1.getParent());
                P(f1.canWrite() ? "Faylga yozish mumkin" : "Faylgayozish mumkin emas");
                P(f1.canRead() ? "Fayldan o'qish mumkin" : "Faylgao'qish mumkin emas");
                P(f1.isDirectory() ? "Katalog" : "Katalog emas");
                P(f1.isFile() ? "Oddiy fayl" : "Balkim nomlangan katalog");
            }
            else {
                System.out.println("File allaqachon mavjud!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}