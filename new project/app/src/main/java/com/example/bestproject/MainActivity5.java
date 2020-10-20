package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Bundle b = getIntent().getExtras();
        food_three f1 = (food_three) b.getSerializable("food");


        ImageView img = findViewById(R.id.imageView8);
        TextView name = findViewById(R.id.textView12);
        TextView time = findViewById(R.id.textView13);

        img.setImageResource(f1.getImage());
        name.setText(f1.getName());
        time.setText(f1.getTime());



    }
}