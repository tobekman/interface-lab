package clothingstore;

public class SummerDiscountStrategy implements DiscountStrategy{
    @Override
    public long priceByDiscount(Clothing clothing) {
        if (clothing.getSeason().equalsIgnoreCase("spring")) {
            return Math.round(clothing.getBasePrice() * 0.60);
        } else if (clothing.getSeason().equalsIgnoreCase("summer")) {
            return Math.round(clothing.getBasePrice() * 0.50);
        } else if (clothing.getSeason().equalsIgnoreCase("winter")) {
            return Math.round(clothing.getBasePrice() * 0.70);
        } else {
            return 0;
        }
    }
}
