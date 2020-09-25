package com.example.foodorderingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.firebase.client.Firebase;

public class Manage extends AppCompatActivity {

    ImageButton Cmng,Amng;
    Button logout;
    Firebase mRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        logout= findViewById(R.id.LogOut);
        Cmng = findViewById(R.id.CustomerB);
        Amng = findViewById(R.id.MenuB);
        mRef = new Firebase("https://food-ordering-system-752f4.firebaseio.com/");
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Firebase mc = mRef.child("Name");
                mc.setValue("Sachini");
                Intent x = new Intent(Manage.this,CManage.class);
                setIntent(x);
            }
        });
        Cmng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Manage.this,CManage.class);
                setIntent(x);
            }
        });

        Amng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");// Firebase mc = mRef.child("Name");
               // mc.setValue("sssss");
                startActivity(new Intent(Manage.this, TopEats.class));
            }
        });


    }
}