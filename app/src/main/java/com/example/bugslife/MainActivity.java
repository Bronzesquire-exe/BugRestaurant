package com.example.bugslife;

import android.content.DialogInterface;
import android.content.Intent;
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

menu.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
         Intent intent = new Intent(MainActivity.this, MainMenu.class);
        startActivity(intent);
    }
});

    }



}