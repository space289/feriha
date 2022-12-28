package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("bilgiler");
        binding.textViewsonucAd.setText(bilgiler.getAdiSoyadi());
        binding.textViewSonucMail.setText(bilgiler.geteMail());
        binding.textViewSonucTelefon.setText(bilgiler.getTelefonNo());
    }
}