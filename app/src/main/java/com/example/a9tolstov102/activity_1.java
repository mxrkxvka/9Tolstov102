package com.example.a9tolstov102;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button btnReg = findViewById(R.id.btnNextPage);

        View.OnClickListener newWindow = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_1.this, activity_2.class);
                startActivity(intent);
            }
        };

        btnReg.setOnClickListener(newWindow);
    }
}