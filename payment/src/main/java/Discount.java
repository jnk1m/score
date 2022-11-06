public class Discount {
    private final long discountAmt;

    public Discount(long discountAmt){
        this.discountAmt = discountAmt;
    }

    private static Discount of(long discountAmt){
        return new Discount(discountAmt);
    }

}
