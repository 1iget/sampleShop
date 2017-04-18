package domain;

import java.math.BigDecimal;

/**
 * Created by gostr on 4/18/2017.
 */
public abstract class Stuff {

    public abstract BigDecimal getPrice();
    public abstract BigDecimal getPrice(ShoppingCart shoppingCart);

}
