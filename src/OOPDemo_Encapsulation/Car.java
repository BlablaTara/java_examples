package OOPDemo_Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.setYear(year); // vi har lavet en setter
        this.setColor(color);
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }//SKal sættes i konstruktøren



    public void drive(){
        System.out.println("You drive the car");
    }

    public void brake(){
        System.out.println("You brake the car");
    }

}
