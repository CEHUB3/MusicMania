public interface PriceableWithVAT25 extends Priceable{

    @Override default double getVAT(){
        return  0.25;
    }

}
