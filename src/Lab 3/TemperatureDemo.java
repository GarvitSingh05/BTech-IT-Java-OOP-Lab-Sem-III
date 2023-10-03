class Temperature {
    private double value;
    private String unit; // Its value can be ‘Celsius’ or ‘Fahrenheit’

    // Constructor to initialize the attributes
    public Temperature(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    // Accessors for the attributes
    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    // Method to convert temperature from Celsius to Fahrenheit
    public void convertToFahrenheit() {
        if (unit.equalsIgnoreCase("Celsius")) {
            value = (value * 9 / 5) + 32;
            unit = "Fahrenheit";
        }
    }

    // Method to convert temperature from Fahrenheit to Celsius
    public void convertToCelsius() {
        if (unit.equalsIgnoreCase("Fahrenheit")) {
            value = (value - 32) * 5 / 9;
            unit = "Celsius";
        }
    }

    // Method to compare temperatures
    public int compare(Temperature other) {
        if (unit.equalsIgnoreCase("Celsius") && other.unit.equalsIgnoreCase("Fahrenheit")) {
            other.convertToCelsius();
        } else if (unit.equalsIgnoreCase("Fahrenheit") && other.unit.equalsIgnoreCase("Celsius")) {
            convertToCelsius();
        }
        return Double.compare(value, other.value);
    }
}

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(25.0, "Celsius");
        Temperature temp2 = new Temperature(77.0, "Fahrenheit");

        // Convert temp2 to Celsius
        temp2.convertToCelsius();

        // Compare temperatures
        int comparison = temp1.compare(temp2);

        System.out.println("Temperature 1: " + temp1.getValue() + " " + temp1.getUnit());
        System.out.println("Temperature 2: " + temp2.getValue() + " " + temp2.getUnit());

        if (comparison == 0) {
            System.out.println("Both temperatures are equal.");
        } else if (comparison < 0) {
            System.out.println("Temperature 1 is lower.");
        } else {
            System.out.println("Temperature 2 is lower.");
        }
    }
}
