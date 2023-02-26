package com.example.arithematicop;
import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity; public class MainActivity extends AppCompatActivity {
// define the global variable

// variable number1, number2 for input input number
// Add_button, result textView

    EditText number1;
    EditText number2;
    Button Add_button;
    TextView result;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// by ID we can use each component which id is assign in xml file number1=(EditText) findViewById(R.id.editText_first_no); number2=(EditText) findViewById(R.id.editText_second_no); Add_button=(Button) findViewById(R.id.add_button);
        result = (TextView) findViewById(R.id.textView2);

// Add_button add clicklistener Add_button.setOnClickListener(new View.OnClickListener() {

        public void onClick (View v){


            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
        }
    }
}
