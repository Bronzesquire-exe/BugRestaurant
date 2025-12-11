
package com.example.bugslife;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

        TextView itemsText = findViewById(R.id.itemsText);
        TextView subtotalText = findViewById(R.id.subtotalText);
        TextView taxText = findViewById(R.id.taxText);
        TextView totalText = findViewById(R.id.totalText);


        ArrayList<String> items = getIntent().getStringArrayListExtra("items");
        double subtotal = getIntent().getDoubleExtra("subtotal", 0);
        double tax = getIntent().getDoubleExtra("tax", 0);
        double total = getIntent().getDoubleExtra("Total", 0);


        String list = "";
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                list = list + items.get(i) + "\n";
            }
        }

        itemsText.setText(list);
        subtotalText.setText("Subtotal: $" + subtotal);
        taxText.setText("Tax: $" + tax);
        totalText.setText("Total: $" + total);
    }
}
