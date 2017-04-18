package service;

import domain.ShoppingCart;
import domain.Stuff;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gostr on 4/18/2017.
 */
public class CheckoutService {

    public BigDecimal checkout(List<Stuff> stuffList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        ShoppingCart currentShoppingCart = new ShoppingCart();
        for(Stuff stuff : stuffList) {
            currentShoppingCart.addStuff(stuff);
            totalPrice.add(stuff.getPrice(currentShoppingCart));
        }

        return totalPrice;
    }
}
