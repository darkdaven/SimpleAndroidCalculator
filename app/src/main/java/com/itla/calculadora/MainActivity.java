package com.itla.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button add = findViewById(R.id.add);

        final EditText firstValue = findViewById(R.id.firstValue);
        final EditText secondValue = findViewById(R.id.secondValue);
        final TextView calcResult = findViewById(R.id.calcResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float value1 = Float.parseFloat(firstValue.getText().toString());
                float value2 = Float.parseFloat(secondValue.getText().toString());
                float result = value1 + value2;

                calcResult.setText(String.valueOf(result));

            }
        });

    }
}