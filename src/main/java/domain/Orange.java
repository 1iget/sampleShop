package domain;

import java.math.BigDecimal;

/**
 * Created by gostr on 4/18/2017.
 */
public class Orange extends Stuff{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(25);
    }

    @Override
    public BigDecimal getPrice(ShoppingCart shoppingCart) {
        Long numberOfCurrentStuff = shoppingCart.getNumberOfStaff(this.getClass());

        if(numberOfCurrentStuff % 3 == 0) {
            return new BigDecimal(0);
        } else {
            return getPrice();
        }
    }

}
