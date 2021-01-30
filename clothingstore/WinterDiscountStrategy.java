package clothingstore;

public class WinterDiscountStrategy implements DiscountStrategy{
    @Override
    public long priceByDiscount(Clothing clothing) {
        double isJacket = 1;
        if(clothing instanceof Jacket) {
            isJacket = 0.90;
        }

        if (clothing.getSeason().equalsIgnoreCase("fall")) {
            return Math.round(clothing.getBasePrice() * 0.60 * isJacket);
        } else if (clothing.getSeason().equalsIgnoreCase("winter")) {
            return Math.round(clothing.getBasePrice() * 0.50 * isJacket);
        } else if (clothing.getSeason().equalsIgnoreCase("summer")) {
            return Math.round(clothing.getBasePrice() * 0.75 * isJacket);
        } else {
            return 0;
        }
    }
}
