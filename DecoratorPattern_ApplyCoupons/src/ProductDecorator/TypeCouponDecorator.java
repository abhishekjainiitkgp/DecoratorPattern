package ProductDecorator;

import ProductPacakage.Product;
import ProductPacakage.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class TypeCouponDecorator extends CouponDecorator {
    Product product;
    double discountPercentage;
    ProductType type;

    static List<ProductType> eligibleTypes= new ArrayList<>();
    static{
        eligibleTypes.add(ProductType.FURNITURES);
        eligibleTypes.add(ProductType.DECORATIVES);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType type) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.type = type;
    }

    @Override
    public double getPrice() {
        double price=product.getPrice();
        if(eligibleTypes.contains(type)){
            return price - (price*discountPercentage)/100;
        }
        return price;
    }
}
