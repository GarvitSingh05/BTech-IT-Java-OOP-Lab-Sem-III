public class Car {
    private int year;
    private String make;
    private double speed;

    // Constructor
    public Car(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    // Accelerate methods
    public void accelerate() {
        speed += 1.0;
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    // Brake method
    public void brake(int b) {
        speed -= Math.sqrt(b);
    }

    public Car() {
        year = 2023;  // Set a default year
        make = "Tata";  // Set a default make
        speed = 120.0;  // Set default speed to 0.0
    }
    
}

