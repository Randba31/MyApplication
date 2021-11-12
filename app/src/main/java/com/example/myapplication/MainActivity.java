package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInput=findViewById(R.id.Input);
    TextView etResult=findViewById(R.id.resultMain);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void converttoNIS(View view) {

        double dollar =Double.parseDouble(etInput.getText().toString());
        double result=(dollar*3.19);
        etResult.setText(String.valueOf(result));
    }

    public void converttoFahrenheit(View view) {

        double Cels=Double.parseDouble((etInput.getText().toString()));
        double Result=(9/5)*Cels + 32;
        etResult.setText(String.valueOf(Result));
    }

    public void ToAnotherPage(View view)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}