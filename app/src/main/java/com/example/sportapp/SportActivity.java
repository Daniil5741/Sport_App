package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SportActivity extends AppCompatActivity {

    public static final String EXTRA_SPORT = "sportid";
    ImageView imageView;
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        int id =  getIntent().getIntExtra(EXTRA_SPORT,0);
        Sport sport = Sport.sports[id];
        imageView = findViewById(R.id.sportActivity_image);
        imageView.setImageResource(sport.getImageResourseId());
        textView = findViewById(R.id.sportActivity_name);
        textView.setText(sport.getName());
        textView1 = findViewById(R.id.sportActivity_description);
        textView1.setText(sport.getDescription());
    }
}
