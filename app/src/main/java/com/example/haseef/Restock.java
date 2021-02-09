package com.example.haseef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Restock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restock);
        ImageView setting_icons = findViewById(R.id.setting);
        ImageView notifications_icons = findViewById(R.id.notifications);
        ImageView back_icons = findViewById(R.id.back);


        setting_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSettingActivity();
            }
        });

        notifications_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTonotificationsActivity();
            }
        });

        back_icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
    private void goToSettingActivity() {
        Intent intent = new Intent(this,
                setting.class);
        startActivity(intent);
    }
    private void goTonotificationsActivity() {
        Intent intent = new Intent(this,
                setting.class);
        startActivity(intent);
    }
    }
