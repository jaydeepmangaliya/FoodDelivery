package com.example.farmer;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SignUpActivity extends AppCompatActivity {
 private TextView ahAccount;
    EditText Rusername ;
    EditText Remailid ;
    EditText Rpassword ;
    Button registerbtn;

    private FirebaseDatabase   database;
    DatabaseReference databaseReference;

 private FirebaseAuth firebaseauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
         Rusername = findViewById(R.id.Rusername);
         Remailid = findViewById(R.id.Remailid);
         Rpassword = findViewById(R.id.Rpassword);
         registerbtn = findViewById(R.id.registerbtn);
        firebaseauth = FirebaseAuth.getInstance();

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                databaseReference = database.getReference("user");
                String username = Rusername.getText().toString();
                String email = Remailid.getText().toString();
                String pass = Rpassword.getText().toString();
                RegisterFirebaseHelper rh = new RegisterFirebaseHelper(username,pass,email);
                databaseReference.child(username).setValue(rh);
                Toast.makeText(SignUpActivity.this, "Signup successsfull !", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUpActivity.this , SecondLoingActivity.class));
                finish();





            }
        });

        initView();

    }

    private void initView() {
        ahAccount = findViewById(R.id.ahAccount);
        ahAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

    startActivity(new Intent(SignUpActivity.this , SecondLoingActivity.class));
    finish();


            }
        });
    }
}