public class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;

    // Constructors

    // Constructor with all attributes
    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }

    // Constructor with name and idNo (default balance = 5000)
    public Customer(String name, String idNo) {
        this(name, idNo, 5000);
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }

    public double getBalance() {
        return balance;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    // Method to print details of purchased item and balance
    public void print() {
        System.out.println("Purchased Item: " + item.getItemName() + ", " + item.getItemidNo() + ", " +
                           item.getItemQuantity() + ", " + item.getItemPrice());
        System.out.println("Balance:" + balance);
    }

    // Method to buy an item
    public void buyItem(Item item) {
        if (balance >= item.getItemPrice() && item.getItemQuantity() >= 1) {
            this.item = item;
            balance -= item.getItemPrice();
            System.out.println("Item bought successfully!");
            print();
        } else if (balance < item.getItemPrice()) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Order is not valid");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer("Garvit Singh", "C12345");

        Item item = new Item("Books", "719", 2, 100);

        customer.buyItem(item);
    }
}
