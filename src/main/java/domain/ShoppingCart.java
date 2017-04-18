package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gostr on 4/18/2017.
 */
public class ShoppingCart {

    private List<Stuff> stuffList = new ArrayList<Stuff>();

    public List<Stuff> getStuffList() {
        return stuffList;
    }

    public ShoppingCart addStuff(Stuff stuff) {
        this.stuffList.add(stuff);
        return this;
    }

    public Long getNumberOfStaff(Class clazz) {
        Long numberOfCurrentStuff = 0L;
        for(Stuff stuffCurrent : stuffList) {
            if(clazz.equals(stuffCurrent.getClass())) {
                numberOfCurrentStuff++;
            }
        }

        return numberOfCurrentStuff;
    }
}
