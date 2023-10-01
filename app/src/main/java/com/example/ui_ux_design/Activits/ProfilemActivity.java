package com.example.ui_ux_design.Activits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ui_ux_design.R;

public class ProfilemActivity extends AppCompatActivity {

    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilem);

        arrow = findViewById(R.id.imageView5);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilemActivity.this,IntrosActivity.class));
            }
        });
     }
}