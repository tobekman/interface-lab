package clothingstore;

public class BlackFridayDiscountStrategy implements DiscountStrategy{
    @Override
    public long priceByDiscount(Clothing clothing) {
        if (clothing instanceof Jacket) {
            return Math.round(clothing.getBasePrice() * 0.90);
        } else if (clothing instanceof Socks) {
            return Math.round(clothing.getBasePrice() * 0.80);
        } else {
            return Math.round(clothing.getBasePrice() * 0.75);
        }
    }
}
