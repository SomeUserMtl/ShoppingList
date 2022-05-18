package com.midterm.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.midterm.shoppinglist.databinding.ActivityMainBinding;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String total;

    HashMap<String, UserInput> cb_et = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        cb_et.put("milk", new UserInput(binding.cbMilk, binding.etMilk));
        cb_et.put("eggs", new UserInput(binding.cbEggs, binding.etEggs));
        cb_et.put("beef", new UserInput(binding.cbBeef, binding.etBeef));
        cb_et.put("soda", new UserInput(binding.cbSoda, binding.etSoda));
        cb_et.put("buiscuits", new UserInput(binding.cbBuiscuits, binding.etBuiscuits));
        cb_et.put("fruits", new UserInput(binding.cbFruits, binding.etFruits));
        cb_et.put("veggies", new UserInput(binding.cbVeggies, binding.etVeggies));

        // ocClick listener
        binding.btnCheckout.setOnClickListener(view -> {
            total = CalculateTotal.getCalculateInstance().calcTotal(cb_et);
            binding.tvTotal.setText(total);
        });


    }
}