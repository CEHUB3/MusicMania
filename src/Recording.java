public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private final int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;

    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return this.year;
    }

    public int getCondition() {
        return condition;
    }

    public abstract String getType();

    @Override
    public double getPrice() {
        return Math.max(10, price * condition / 10.0);
    }

    protected double getOriginalPrice(){
        return price;
    }

    public String toString() {
        return getType() + "{ name=" + getName() + " artist=" + artist + " year=" + year + " condition=" + condition + " original price=" + price + " price=" + getPrice()
                + " price +VAT" + getPriceWithVAT() + "}";
    }
}