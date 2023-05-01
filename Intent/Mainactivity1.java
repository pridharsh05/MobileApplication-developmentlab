package com.example.intent1; import android.content.Intent; import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity2 extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) { 
  super.onCreate(savedInstanceState); 
  setContentView(R.layout.activity_main2); 
  ActionBar actionBar = getSupportActionBar(); 
  actionBar.setTitle("Second Activity");
Intent intent = getIntent();
String name = intent.getStringExtra("NAME");
  String email = intent.getStringExtra("EMAIL");
 
String phone = intent.getStringExtra("PHONE"); 
  TextView mResultTv = findViewById(R.id.resultTv);
mResultTv.setText("Name: "+name+"\nEmail: "+email+ "\nPhone: "+phone);
}
}

