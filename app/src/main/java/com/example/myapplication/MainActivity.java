package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IvMap = findViewById(R.id.Iv_map);
        IvMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pindahpeta = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(pindahpeta);
    }
}
