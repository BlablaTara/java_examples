package InterfaceDemo2;

public class Turtle implements Animal {
    private int ageInMonth;
    private int topSpeed;


    public int getAgeInMonth() {
        return ageInMonth;
    }
    public void setAgeInMonth(int ageInMonth) {
        this.ageInMonth = ageInMonth;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void eat() {
        System.out.println("This turtle is eating");
    }
    @Override
    public void sleep() {
        System.out.println("This turtle is sleeping");
    }
}
