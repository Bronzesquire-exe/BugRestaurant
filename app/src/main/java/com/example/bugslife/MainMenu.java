package com.example.bugslife;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    Order order = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button star = findViewById(R.id.stars);

        TextView chili = findViewById(R.id.chili);
        chili.setOnClickListener(v -> {
            order.addItem("Cricket Chili", 15, 1);
        });

        TextView escamoles = findViewById(R.id.Escamoles);
        escamoles.setOnClickListener(v -> {
            order.addItem("Escamoles", 13, 2);
        });
        TextView tsukusdani = findViewById(R.id.Tsukusdani);
        tsukusdani.setOnClickListener(v -> {
            order.addItem("Tsukusdani", 16, 2);
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "Thanks For 5 Stars", Toast.LENGTH_SHORT).show();
            }
        });

    Button checkout = findViewById(R.id.checkout);
    checkout.setOnClickListener(v->

    {


        Intent intent = new Intent(MainMenu.this, Checkout.class);

        intent.putExtra("subtotal", order.subTotal());
        intent.putExtra("tax", order.getTax());
        intent.putExtra("Total", order.getTotal());

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < order.getItem().size(); i++) {
            names.add(order.getItem().get(i).getName());
        }

        intent.putStringArrayListExtra("items", names);

        startActivity(intent);


    });
}
}

