package com.example.bugslife;

import android.annotation.SuppressLint;
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
        escamoles.setOnClickListener(v ->{
            order.addItem("Escamoles", 13, 2);
        });
        TextView tsukusdani = findViewById(R.id.Tsukusdani);
        tsukusdani.setOnClickListener(v ->{
            order.addItem("Tsukusdani", 16, 2);
        });

star.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainMenu.this, "Thanks For 5 Stars", Toast.LENGTH_SHORT).show();
    }
});
    }

}