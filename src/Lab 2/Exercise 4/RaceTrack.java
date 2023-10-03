public class RaceTrack {
    public static void main(String[] args) {
        // Create a new Car object
        Car car1 = new Car(2022, "Mahindra", 125.0);

        // Display initial status
        System.out.println("Car 1 Year: " + car1.getYear());
        System.out.println("Car 1 Make: " + car1.getMake());
        System.out.println("Car 1 Speed: " + car1.getSpeed());

        // Accelerate and display speed
        car1.accelerate();
        System.out.println("After Accelerate: " + car1.getSpeed());

        // Accelerate with an increment and display speed
        car1.accelerate(10);
        System.out.println("After Accelerate(10): " + car1.getSpeed());

        // Brake and display speed
        car1.brake(4);
        System.out.println("After Brake: " + car1.getSpeed());

        // Create a new Car object without arguments
        Car car2 = new Car();

        // Display the default values for car2
        System.out.println("Car 2 Year: " + car2.getYear());
        System.out.println("Car 2 Make: " + car2.getMake());
        System.out.println("Car 2 Speed: " + car2.getSpeed());
    }
}
