package com.example.Intent2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        final EditText mNameEt = findViewById(R.id.nameEt);
        final EditText mEmailEt = findViewById(R.id.emailEt);
        final EditText mphoneEt = findViewById(R.id.phoneEt);
        Button mSaveBtn = findViewById(R.id.saveBtn);

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mphoneEt.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                intent.putExtra("NAME",name);
                intent.putExtra("EMAIL",email);
                intent.putExtra("PHONE",phone);
                startActivity(intent);

            }
        });
    }
}
