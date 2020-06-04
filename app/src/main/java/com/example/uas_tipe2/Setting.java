package com.example.uas_tipe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Setting extends AppCompatActivity {
    Button listBtn, settingBtn, profileBtn;
    Spinner mView, mBahasa;
    Switch mMode;
    TextView mAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        listBtn = findViewById(R.id.list);
        settingBtn = findViewById(R.id.setting);
        profileBtn = findViewById(R.id.profile);
        mView = findViewById(R.id.tampilan);
        mBahasa = findViewById(R.id.bahasa);
        mMode = findViewById(R.id.dark_mode);
        mAbout = findViewById(R.id.about);

        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Home.class));
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Setting.class));
            }
        });

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });

        mAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),About.class));
            }
        });
    }
}
