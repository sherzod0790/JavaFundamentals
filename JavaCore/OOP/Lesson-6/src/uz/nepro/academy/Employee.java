package uz.nepro.academy;


public class Employee {

    private String name;
    private double salary;
    private String pinfl;

    public int age;

    public void setPinfl(String pinfl) {
        this.pinfl = pinfl;
    }

    public String getPinfl() {
        return pinfl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
