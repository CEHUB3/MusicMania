import java.util.ArrayList;
import java.util.List;

public class Order {

    private final long orderNumber;
    private static long counter = 0;
    private ArrayList<Priceable> items = new ArrayList<>();


    public Order(Item... items) {
        orderNumber = ++counter;
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public String getReceipt() {

        String str = "Reciept for order #" + orderNumber + "\n" +
                "------------\n";
        for (Priceable p : items) {
            str += p.toString() + "\n";
        }
        str += "Total excl. VAT: " + getTotalValue() + "\n";
        str += "Total incl. VAT: " + getTotalValuePlusVAT() + "\n";
        str += "-------------\n";

        return str;
    }

    public double getTotalValuePlusVAT() {
        double total = 0.0;
        for (var priceable : items) {
            total += priceable.getPriceWithVAT();
        }
        return total;
    }

    public double getTotalValue() {
        double total = 0.0;
        for (var priceable : items) {
            total += priceable.getPrice();
        }
        return total;
    }


}
