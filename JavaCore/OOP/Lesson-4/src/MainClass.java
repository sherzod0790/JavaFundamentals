import uz.bepro.encapsulation.EncapsulationFinal;

public class MainClass {

    // staticni obyekt qilib chaqirib bolmaydi, static faqat class nomi bn chaqiriladi


    public static void main(String[] args) {

        EncapsulationFinal obj = new EncapsulationFinal("fsdfs","fsdfs");

        obj.setId(456);
        System.out.println(obj.getId());

        System.out.println(EncapsulationFinal.getNextId());

    }
}
