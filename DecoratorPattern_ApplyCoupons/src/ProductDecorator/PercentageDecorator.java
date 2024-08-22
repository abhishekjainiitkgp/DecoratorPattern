package ProductDecorator;

import ProductPacakage.Product;

public class PercentageDecorator extends CouponDecorator {
    Product product;
    double percentageDiscount;

    public PercentageDecorator(Product product, int percentageDiscount) {
        this.product = product;
        this.percentageDiscount = percentageDiscount;
    }

    @Override
    public double getPrice(){
        double price=product.getPrice();
        return price- (price*percentageDiscount)/100;
    }
}
