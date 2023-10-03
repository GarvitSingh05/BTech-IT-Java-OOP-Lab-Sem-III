public class Item {
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;

    // Constructors

    // Constructor with all attributes
    public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    // Constructor with itemName, itemidNo, and itemQuantity (default itemPrice = 500)
    public Item(String itemName, String itemidNo, int itemQuantity) {
        this(itemName, itemidNo, itemQuantity, 500);
    }

    // Constructor with itemName and itemidNo (default itemPrice = 500, default itemQuantity = 1)
    public Item(String itemName, String itemidNo) {
        this(itemName, itemidNo, 1, 500);
    }

    // Accessor methods
    public String getItemName() {
        return itemName;
    }

    public String getItemidNo() {
        return itemidNo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    // Mutator methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemidNo(String itemidNo) {
        this.itemidNo = itemidNo;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public static void main(String[] args) {
        // Example usage
        Item item1 = new Item("Pen", "342", 2, 100);
        Item item2 = new Item("Pencil", "237", 3);
        Item item3 = new Item("Compass", "981");

        System.out.println("Item 1: " + item1.getItemName() + ", " + item1.getItemidNo() + ", " +
                           item1.getItemQuantity() + ", " + item1.getItemPrice());

        System.out.println("Item 2: " + item2.getItemName() + ", " + item2.getItemidNo() + ", " +
                           item2.getItemQuantity() + ", " + item2.getItemPrice());

        System.out.println("Item 3: " + item3.getItemName() + ", " + item3.getItemidNo() + ", " +
                           item3.getItemQuantity() + ", " + item3.getItemPrice());
    }
}
