package com.example.haseef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_staff);
        //getSupportActionBar().hide();

        ImageView setting_icons = findViewById(R.id.setting);
        ImageView notifications_icons = findViewById(R.id.notifications);
        ImageView back_icons = findViewById(R.id.back);
        ImageView products=findViewById(R.id.products);
        ImageView products_icons=findViewById(R.id.products_icons);
        ImageView restock =findViewById(R.id.restock);
        ImageView restock_icons =findViewById(R.id.restock_icons);
        ImageView statistic=findViewById(R.id.statistic);
        ImageView statistic_icons=findViewById(R.id.statistic_icons);




        setting_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSettingActivity();
               // finish();
            }
        });

        notifications_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNotificationsActivity();
               // finish();
            }
        });

        back_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              onBackPressed();

            }
        });

        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTabbedProducts();
            }
        });
        products_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTabbedProducts();
            }
        });

        restock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTabbedRestock();
            }
        });
        restock_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTabbedRestock();
            }
        });

        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTostatistic();
            }
        });
        statistic_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTostatistic();
            }
        });

    }
    private void goToSettingActivity() {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }
    private void goToNotificationsActivity() {
        Intent intent = new Intent(this, notifications.class);
        startActivity(intent);
    }

    private void goTostatistic(){
        Intent intent = new Intent(this, statistic.class);
        startActivity(intent);
    }
    private void goToTabbedProducts(){
        Intent intent = new Intent(this, tabbedproduct.class);
        startActivity(intent);
    }
    private void goToTabbedRestock(){
        Intent intent = new Intent(this, tabbedRestock.class);
        startActivity(intent);
    }







}