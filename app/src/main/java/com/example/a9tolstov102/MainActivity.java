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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnReg = findViewById(R.id.btnSignUp);
        CheckBox checkBox = findViewById(R.id.cbAgree);

        View.OnClickListener MainApp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, activity_1.class);
                    startActivity(intent);
                }
            }
        };

        btnReg.setOnClickListener(MainApp);
    }

    /*fun onClickStepsActivity(view: View) {
        val intent = Intent(this, StepsActivity::class.java)
        startActivity(intent)
    }

    fun onCheckboxClicked(view: View) {
        // Получаем функцию перехода на другой экран:
        val checkBox = view as CheckBox
        val selection = findViewById<TextView>(R.id.selection)
        // Получаем, отмечен ли данный флажок
        if (checkBox.isChecked) {
            selection.text = "Включено"
            checkBox.text = "Выключить"
        } else {
            selection.text = "Выключено"
            checkBox.text = "Включить"
        }
    }*/

}