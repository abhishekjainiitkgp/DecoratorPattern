import ProductDecorator.PercentageDecorator;
import ProductDecorator.TypeCouponDecorator;
import ProductPacakage.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;
    public ShoppingCart(){
        productList= new ArrayList<>();
    }
    public void addToCart(Product product){
        //TODO add product with the decorators
        Product productWithEligibleDiscounts= new TypeCouponDecorator( new PercentageDecorator(product, 10), 3, product.getType());
        productList.add(productWithEligibleDiscounts);
    }

    public double getTotalPrice(){
        double totalPrice=0;
        for(Product product:productList){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
}
