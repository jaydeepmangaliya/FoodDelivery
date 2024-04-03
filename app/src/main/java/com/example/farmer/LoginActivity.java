package com.example.farmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class LoginActivity extends AppCompatActivity {
    private EditText editText;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intiView();
    }

    private void intiView() {
        editText =findViewById(R.id.phonenuText);
        btn = findViewById(R.id.numnextbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().length() != 10){
                    Toast.makeText(LoginActivity.this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(LoginActivity.this , PLoginActivity.class));
                }
            }
        });

    }
}