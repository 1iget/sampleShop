package service;

import domain.Stuff;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gostr on 4/18/2017.
 */
public class CheckoutService {

    public BigDecimal checkout(List<Stuff> stuffList) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Stuff stuff : stuffList) {
            totalPrice.add(stuff.getPrice());
        }

        return totalPrice;
    }
}
