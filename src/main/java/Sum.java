public class Sum {
    public Sum() {
    }

    public float solve(Item[] items) {
        float discount = 1;
        float total = 0;

        for (Item item : items) {
            if (total > 100) {
                total += item.getTotal() * discount;
                discount-=(float) 0.2;
            } else {
                total += (float) item.getTotal();
            }
        }

        return total;
    }
}
