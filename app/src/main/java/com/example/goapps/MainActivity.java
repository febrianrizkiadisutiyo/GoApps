package com.example.goapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar rs diclick
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }

    public void clickPolice(View view) {
        Intent i = new Intent(this,Police.class);
        startActivity(i);
    }

    public void clickSuperMarket(View view) {
        Intent i = new Intent(this,Supermarket.class);
        startActivity(i);
    }

    public void clickschool(View view) {
        Intent i = new Intent(this,School.class);
        startActivity(i);
    }
}