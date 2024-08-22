import ProductPacakage.Item1;
import ProductPacakage.Product;
import ProductPacakage.ProductType;

import java.util.PrimitiveIterator;

public class ApplyCouponClient {
    public static void main(String[] args) {
        Product iphone= new Item1("Iphone", 50000, ProductType.ELECTRONICS);
        Product fan= new Item1("FAN", 1000, ProductType.ELECTRONICS);
        Product sofa =new Item1("SOFA", 2000, ProductType.FURNITURES);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(iphone);
        cart.addToCart(fan);
        cart.addToCart(sofa);

        Double cartValue=cart.getTotalPrice();
        System.out.println("Total cart value is "+ cartValue);
    }
}
