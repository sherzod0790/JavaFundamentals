package uz.nepro.academy;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setName("Sherzod");
        developer.setPinfl("32607901234567");
        developer.setBonus(44);
        developer.setLevelDegres("Junior");

        System.out.println(developer.getName() + " " + developer.getPinfl() + " "
                + developer.getBonus() + " " + developer.getLevelDegres());
    }
}
