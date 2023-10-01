package com.example.ui_ux_design.Activits;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

import com.example.ui_ux_design.R;

public class IntrosActivity extends Activity {
    private AppCompatButton introbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intros);

        introbtn = findViewById(R.id.introBtn);

        introbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntrosActivity.this,IntroActivity.class));
            }
        });
    }
}
