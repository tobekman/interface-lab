package clothingstore;

public class Clothing {
    private String name;
    private String season;
    private long basePrice;
    private long finalPrice;

    public Clothing(String name, String season, int basePrice) {
        this.name = name;
        this.season = season;
        this.basePrice = basePrice;
        this.finalPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        finalPrice = discountStrategy.priceByDiscount(this);
    }

    public long getPrice() {
        if (finalPrice != 0) {
            return finalPrice;
        }
        return basePrice;
    }
}
