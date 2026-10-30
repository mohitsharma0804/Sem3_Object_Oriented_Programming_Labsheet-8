import java.io.Serializable;

public class CarBean implements Serializable {
    private String make;
    private String model;
    private int year;

    public CarBean() {}

    public CarBean(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public static void main(String[] args) {
        CarBean car = new CarBean();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear(2024);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
    }
}
