package com.example.uas_tipe2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Add extends AppCompatActivity {
    EditText mNama, mEmail, mHp, mSubject, mBiografi, mGaji;
    Spinner mPosisi;
    CheckBox mKelas;
    FirebaseDatabase database;
    DatabaseReference reff;
    Button tambahBtn, cancelBtn;
    Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        mNama = findViewById(R.id.input_name);
        mEmail = findViewById(R.id.input_email);
        mHp = findViewById(R.id.input_phone);
        mSubject = findViewById(R.id.input_subject);
        mBiografi = findViewById(R.id.input_biografi);
        mGaji = findViewById(R.id.input_gaji);
        mPosisi = findViewById(R.id.posisi);
        mKelas = findViewById(R.id.kelasA);
        database = FirebaseDatabase.getInstance();
        reff = database.getReference("Employee");

        tambahBtn = findViewById(R.id.add_employee);
        cancelBtn = findViewById(R.id.cancel_add);



        tambahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Home.class));
            }
        });
    }

    private void addData(){
        String id = reff.push().getKey();
        String nama = mNama.getText().toString().trim();
        String hp = mHp.getText().toString().trim();
        String email = mEmail.getText().toString().trim();
        String subject = mSubject.getText().toString().trim();
        String biografi = mBiografi.getText().toString().trim();
        int gaji = Integer.parseInt(mGaji.getText().toString().trim());
        String posisi = mPosisi.getSelectedItem().toString().trim();
        String kelas = mKelas.getText().toString().trim();

        employee = new Employee(id, nama, hp, email, subject, biografi, posisi, kelas, gaji);
        reff.child(id).setValue(employee);

        Toast.makeText(Add.this, "Data inserted", Toast.LENGTH_SHORT).show();

    }
}
