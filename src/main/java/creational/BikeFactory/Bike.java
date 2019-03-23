package creational.BikeFactory;

public class Bike {
    private String brand;
    private int seats, gears;
    private BikeType type;
    public Bike(String brand, int seats, int gears, BikeType type) {
        super();
        this.brand = brand;
        this.seats = seats;
        this.gears = gears;
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public BikeType getType() {
        return type;
    }
    public void setType(BikeType type) {
        this.type = type;
    }
}
