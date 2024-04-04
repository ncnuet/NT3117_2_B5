public class Item {
    private final int price;
    private final int quantity;

    public Item(int price, int quantity) {
        this.price = Math.max(price, 0);
        this.quantity = Math.max(quantity, 0);
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return this.price * this.quantity;
    }
}
