package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ShowActivity extends AppCompatActivity {

    private TextView cityNametext;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);

        cityNametext = findViewById(R.id.text_city_name);
        backButton   = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra("city_name");
        cityNametext.setText(cityName);


        backButton.setOnClickListener(v -> {
            //Intent intent = new Intent(ShowActivity.this, MainActivity.class);
            //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            //startActivity(intent);
            finish();
        });
    }
}