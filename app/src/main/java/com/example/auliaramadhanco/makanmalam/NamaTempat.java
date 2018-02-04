package com.example.auliaramadhanco.makanmalam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NamaTempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_tempat);

        Intent intent = getIntent();

        String message = intent.getStringExtra("message");
        String makan = intent.getStringExtra("makan");
        String porsi = intent.getStringExtra("porsi");
        String harga = intent.getStringExtra("harga");

        TextView textMakan = (TextView) findViewById(R.id.menu_text);
        TextView textPorsi = (TextView) findViewById(R.id.porsi_text);
        TextView textharga = (TextView) findViewById(R.id.harga_text);
        Toast toast = Toast.makeText(this, message,Toast.LENGTH_LONG);
        textMakan.setText(makan);
        textPorsi.setText(porsi);
        textharga.setText(harga);
        toast.show();
    }
}
