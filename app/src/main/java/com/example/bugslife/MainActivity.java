package com.example.bugslife;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button menu = findViewById(R.id.menu);
        Button address = findViewById(R.id.address);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });
        address.setOnClickListener(v ->{
            Uri location = Uri.parse("geo:0,0?q=Baltimore+Polytechnic+Institute+Baltimore+MD");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);

        });
        



    }




}