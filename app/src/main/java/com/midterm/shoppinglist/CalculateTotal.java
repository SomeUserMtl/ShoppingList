package com.midterm.shoppinglist;

import android.util.Log;
import android.widget.CheckBox;
import java.util.HashMap;

public class CalculateTotal {

    private static CalculateTotal calculateTotal;
    HashMap<String, Double> price = new HashMap<>();

    public static CalculateTotal getCalculateInstance(){
        if (calculateTotal != null)
            return calculateTotal;
        else
            return new CalculateTotal();
    }

    public void setPrices() {
        price.put("milk", 1.0);
        price.put("eggs", 1.0);
        price.put("beef", 2.0);
        price.put("soda", 3.0);
        price.put("buiscuits", 4.0);
        price.put("fruits", 5.0);
        price.put("veggies", 6.0);
    }

    public String calcTotal(HashMap<String, UserInput> map){
        double total = 0;
        setPrices();
        for (HashMap.Entry<String, UserInput> entry : map.entrySet()){

            CheckBox cb = entry.getValue().getCheckBox();
            String et = entry.getValue().getEditText().getText().toString();
            String pr = entry.getKey();

            if (cb.isChecked() && !et.isEmpty() && price.get(pr) != null)
            {
                total += Integer.parseInt(et) * price.get(pr);
                Log.d("test123", total +"");
            }
        }
       return String.valueOf(total);
    }
}
