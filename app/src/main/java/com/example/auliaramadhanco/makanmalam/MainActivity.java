package com.example.auliaramadhanco.makanmalam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private String message;

    private EditText makan;
    private EditText porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        porsi = (EditText) findViewById(R.id.text_porsimakan);
        makan = (EditText) findViewById(R.id.text_makanmalam);
    }

    public void Abnormal(View view) {
        Log.d(LOG_TAG, "button_clocked");
        Intent intent = new Intent(this, NamaTempat.class);
        message = "Disini aja makannya";
        int mPorsi = Integer.parseInt(porsi.getText().toString())*30000;
        intent.putExtra("message", message);
        intent.putExtra("makan", makan.getText().toString());
        intent.putExtra("porsi", porsi.getText().toString());
        intent.putExtra("harga", String.valueOf(mPorsi));
        startActivity(intent);
    }

    public void Eatbus(View view) {
        Log.d(LOG_TAG, "button_clocked");
        Intent intent = new Intent(this, NamaTempat.class);
        message = "janngan makan Malam disini, uang kamu tidak cukup";
        int mPorsi = Integer.parseInt(porsi.getText().toString())*50000;
        intent.putExtra("message", message);
        intent.putExtra("makan", makan.getText().toString());
        intent.putExtra("porsi", porsi.getText().toString());
        intent.putExtra("harga", String.valueOf(mPorsi));
        startActivity(intent);
    }
}
