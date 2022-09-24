package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {

    ImageView pepP, cheeseP, mashroomsP,pineappleP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        pepP =findViewById(R.id.pep);
        cheeseP =findViewById(R.id.cheese);
        mashroomsP =findViewById(R.id.mashroom);
        pineappleP =findViewById(R.id.pineapple);

        pepP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(), PepperoniPizza.class);
                startActivity(p);
            }
        });

        cheeseP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(), CheesePizza.class);
                startActivity(c);
            }
        });

        mashroomsP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Mashrooms.class);
                startActivity(m);
            }
        });

        pineappleP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(), PineApplePizza.class);
                startActivity(p);
            }
        });
    }
}