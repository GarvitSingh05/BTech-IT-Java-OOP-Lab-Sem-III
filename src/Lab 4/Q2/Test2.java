//Exercise 3.2, Two Dimensional Arrays

class Address {
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String state;
    private String pin;

    public Address(String data) {
        String[] values = data.split("\\$");
        if (values.length == 6) {
            this.line1 = values[0];
            this.line2 = values[1];
            this.line3 = values[2];
            this.city = values[3];
            this.state = values[4];
            this.pin = values[5];
        } else {
            // Handle incorrect data format
            throw new IllegalArgumentException("Invalid data format for Address");
        }
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }
}

class AddressList {

    public static int countAddressWithCity(Address[] addressList, String city) {
        if (addressList == null || city == null || addressList.length == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addressList) {
            if (address.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    public static int countAddressWithPin(Address[] addressList, String strP) {
        if (addressList == null || strP == null || addressList.length == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addressList) {
            if (address.getPin().startsWith(strP)) {
                count++;
            }
        }
        return count;
    }

    public static Address[] getAddressWithCity(Address[] addressList, String city) {
        if (addressList == null || city == null || addressList.length == 0) {
            return null;
        }

        int count = countAddressWithCity(addressList, city);
        if (count == 0) {
            return null;
        }

        Address[] result = new Address[count];
        int index = 0;
        for (Address address : addressList) {
            if (address.getCity().equals(city)) {
                result[index++] = address;
            }
        }
        return result;
    }

    public static Address[] getAddressWithPin(Address[] addressList, String strP) {
        if (addressList == null || strP == null || addressList.length == 0) {
            return null;
        }

        int count = countAddressWithPin(addressList, strP);
        if (count == 0) {
            return null;
        }

        Address[] result = new Address[count];
        int index = 0;
        for (Address address : addressList) {
            if (address.getPin().startsWith(strP)) {
                result[index++] = address;
            }
        }
        return result;
    }
}

public class Test {
    public static void main(String[] args) {
        // Create an array of addresses for testing
        Address[] addresses = {
            new Address("123 First Street$Unit 4$Building B$City1$State1$12345"),
            new Address("456 Second Street$Unit 7$Building C$City2$State2$56789"),
            new Address("789 Third Street$Unit 2$Building A$City1$State3$54321")
        };

        // Test countAddressWithCity
        int countCity1 = AddressList.countAddressWithCity(addresses, "City1");
        System.out.println("Count of addresses in City1: " + countCity1);

        // Test countAddressWithPin
        int countPinStartsWith5 = AddressList.countAddressWithPin(addresses, "5");
        System.out.println("Count of addresses with pin starting with 5: " + countPinStartsWith5);

        // Test getAddressWithCity
        Address[] city1Addresses = AddressList.getAddressWithCity(addresses, "City1");
        System.out.println("Addresses in City1:");
        printAddresses(city1Addresses);

        // Test getAddressWithPin
        Address[] pinStartsWith5Addresses = AddressList.getAddressWithPin(addresses, "5");
        System.out.println("Addresses with pin starting with 5:");
        printAddresses(pinStartsWith5Addresses);
    }

    private static void printAddresses(Address[] addresses) {
        if (addresses != null) {
            for (Address address : addresses) {
                System.out.println(address.getLine1() + ", " + address.getCity() + ", " + address.getPin());
            }
        } else {
            System.out.println("No addresses found.");
        }
    }
}
