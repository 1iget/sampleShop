package domain;

import java.math.BigDecimal;

/**
 * Created by gostr on 4/18/2017.
 */
public class Apple extends Stuff{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(60);
    }

    @Override
    public BigDecimal getPrice(ShoppingCart shoppingCart) {
        Long numberOfCurrentStuff = shoppingCart.getNumberOfStaff(this.getClass());

        if(numberOfCurrentStuff % 2 == 0) {
            return new BigDecimal(0);
        } else {
            return getPrice();
        }
    }
}
