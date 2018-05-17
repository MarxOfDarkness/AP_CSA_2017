package csa;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
    private List<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }

    public int getTotalBoxes(){
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumBoxes();
        }
        return total;
    }

    public int removeVariety(String cookieVar){
        int total = 0;
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getVariety().equals(cookieVar)){
                total += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }
        return total;
    }
}
