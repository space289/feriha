package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText ad;
    EditText mail;
    EditText telefon;
    Button onayla;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        ad = findViewById(R.id.Ad);
        mail = findViewById(R.id.mail);
        telefon = findViewById(R.id.telefon);
        onayla = findViewById(R.id.button);
        onayla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                digerActivity(view);
            }
        });
    }


    public void digerActivity(View view){
        String adiSoyadi = binding.Ad.getText().toString();
        String eMail= binding.mail.getText().toString();
        String telefonNo= binding.telefon.getText().toString();
        Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi,eMail,telefonNo);
        Intent intent = new Intent(this.getApplicationContext(),Activity2.class);
        intent.putExtra("bilgiler",bilgilerSerializable);
        startActivity(intent);
    }
}