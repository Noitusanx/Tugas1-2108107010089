package com.example.tugas1_pbm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama, npm, jurusan;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        npm = findViewById(R.id.npm);
        jurusan = findViewById(R.id.jurusan);
        btnSimpan = findViewById(R.id.simpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaMahasiswa = nama.getText().toString().trim();
                String npmMahasiswa = npm.getText().toString().trim();
                String jurusanMahasiswa = jurusan.getText().toString().trim();

                if(namaMahasiswa.isEmpty() || npmMahasiswa.isEmpty() || jurusanMahasiswa.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon lengkapi semua data", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
