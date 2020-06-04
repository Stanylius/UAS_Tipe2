package com.example.uas_tipe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView mNama, mJabatan, mBio;
    Button editBtn, backBtn, listBtn, settingBtn, profileBtn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mNama = findViewById(R.id.nama);
        mJabatan = findViewById(R.id.jabatan);
        mBio = findViewById(R.id.biografi);
        editBtn = findViewById(R.id.ubah);
        backBtn = findViewById(R.id.kembali);
        listBtn = findViewById(R.id.list);
        settingBtn = findViewById(R.id.setting);
        profileBtn = findViewById(R.id.profile);
        editText = new EditText(this);

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

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Home.class));
            }
        });

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(mNama.getText());
                mNama.setText(editText.getText());
                editText.setText(mJabatan.getText());
                mJabatan.setText(editText.getText());
                editText.setText(mBio.getText());
                mBio.setText(editText.getText());
            }
        });
    }
}
