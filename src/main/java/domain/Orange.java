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

}
