package clothingstore;

public class Main {
    public static void main(String[] args) {
        Jacket linenCoat = new Jacket("Linen Coat", "fall", 100000);
        System.out.println("Linen Coat: " + linenCoat.getPrice());

        linenCoat.setDiscountStrategy(new BlackFridayDiscountStrategy());
        System.out.println("Linen Coat with black friday discount: " + linenCoat.getPrice());

        linenCoat.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Linen Coat with winter discount: " + linenCoat.getPrice());

        Clothing woolenSocks = new Clothing("Woolen Socks", "winter", 10000);
        System.out.println("\nWoolen Socks: " + woolenSocks.getPrice());

        woolenSocks.setDiscountStrategy(new SummerDiscountStrategy());
        System.out.println("Woolen Socks with summer discount: " + woolenSocks.getPrice());

        woolenSocks.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Woolen Socks with winter discount: " + woolenSocks.getPrice());

        Pants baggyJeans = new Pants("Baggy Jeans", "summer", 70000);
        System.out.println("\nBaggy Jeans: " + baggyJeans.getPrice());

        baggyJeans.setDiscountStrategy(new WinterDiscountStrategy());
        System.out.println("Baggy Jeans with winter discount: " + baggyJeans.getPrice());

        baggyJeans.setDiscountStrategy(new SummerDiscountStrategy());
        System.out.println("Baggy Jeans with summer discount: " + baggyJeans.getPrice());

        baggyJeans.setDiscountStrategy(new BlackFridayDiscountStrategy());
        System.out.println("Baggy Jeans with black friday discount: " + baggyJeans.getPrice());

    }
}
