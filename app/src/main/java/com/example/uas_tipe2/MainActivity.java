package com.example.uas_tipe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class MainActivity extends AppCompatActivity {
EditText nama, email, hp, gaji, biorgrafi;
Spinner posisi;
CheckBox kelas;
Button btnSubmit;

DatabaseReference reff;

Employee employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        nama = (EditText)findViewById(R.id.input_nama);
        email = (EditText)findViewById(R.id.input_email);
        hp = (EditText)findViewById(R.id.input_phone);
        gaji = (EditText)findViewById(R.id.input_gaji);
        biorgrafi = (EditText)findViewById(R.id.input_gaji);

        posisi = (Spinner)findViewById(R.id.posisi);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_posisi, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        posisi.setAdapter(adapter);

        kelas = (CheckBox)findViewById(R.id.kelasA);

        reff = FirebaseDatabase.getInstance().getReference().child("Employee");

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee.setNama(nama.getText().toString().trim());
                employee.setBiografi(biorgrafi.getText().toString().trim());
                employee.setEmail(email.getText().toString().trim());
                employee.setGaji(gaji.getText().toString().trim());
                employee.setHp(hp.getText().toString().trim());
                employee.setKelas(kelas.getText().toString().trim());
                employee.setPosisi(posisi.getSelectedItem().toString().trim());
                Toast.makeText(MainActivity.this, "upload success", Toast.LENGTH_LONG).show();
            }
        });
    }
}
