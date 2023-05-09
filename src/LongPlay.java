public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }
    @Override
    public String getType(){
        return "LP";
    }
    @Override
    public double getPrice(){
        return Math.max(10, getOriginalPrice() * getCondition()/10.0 + (2023 - getYear()) * 5);
    }
}
