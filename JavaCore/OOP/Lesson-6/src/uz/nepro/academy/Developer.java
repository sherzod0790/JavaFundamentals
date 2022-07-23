package uz.nepro.academy;

public class Developer extends Employee{

    private double bonus;

    private String levelDegres;


    public Developer() {
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setLevelDegres(String levelDegres) {
        this.levelDegres = levelDegres;
    }

    public double getBonus() {
        return bonus;
    }

    public String getLevelDegres() {
        return levelDegres;
    }
}
