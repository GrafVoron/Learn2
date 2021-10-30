package by.epam.learn.main;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
       int bonus;
       int discount = 10;
       int purchaseItem = 5;
       final int DISCOUNT_LIMIT = 3;
       bonus = purchaseItem > DISCOUNT_LIMIT ? discount : 0;
   // if (purchaseItem > DISCOUNT_LIMIT) {
        //      bonus = discount;
    //} else {
  //  bonus = 0;
  //}
       System.out.println(bonus);
    }
}