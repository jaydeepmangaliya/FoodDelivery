package com.example.farmer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;
import java.util.Queue;
import java.util.regex.Pattern;

public class SecondLoingActivity extends AppCompatActivity {
   private TextView dhAccount;
   private Button mainlongbtn;
   private EditText emaillogin , passwordlogin;
   private FirebaseAuth  firebaseauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_loing);
        mainlongbtn = findViewById(R.id.mainloginbtn);
        emaillogin = findViewById(R.id.emaillogin);
        passwordlogin = findViewById(R.id.passwordlogin);

        mainlongbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isviled() | !isviledd()){

                }
                else {
                    checkuser();
                }
            }
        });
        inview();
    }


    public  boolean isviled(){
        String val = emaillogin.getText().toString();
        if(val.isEmpty()){
            emaillogin.setError("Enter Email");
            return  false;
        }
        else{
            emaillogin.setError(null);
            return true;
        }
    }
    public  boolean isviledd(){
        String pass = passwordlogin.getText().toString();
        if(pass.isEmpty()){
            passwordlogin.setError("Enter Email");
            return  false;
        }
        else{
            passwordlogin.setError(null);
            return true;
        }
    }

    public  void checkuser(){
        String email = emaillogin.getText().toString().trim();
        String pass =  passwordlogin.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("user");
        Query cheakdatabse = reference.orderByChild("username").equalTo(email);
        cheakdatabse.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    emaillogin.setError(null);
                    String passDATABASE =snapshot.child(pass).child("password").getValue(String.class);
                    if(!Objects.equals(passDATABASE,email)){
                        emaillogin.setError(null);
                        startActivity(new Intent(SecondLoingActivity.this,MainActivity.class));
                       finish();

                    }
                    else {
                        passwordlogin.setError("Invelid Creation");
                        passwordlogin.requestFocus();
                    }
                }
                else {
                    emaillogin.setError("user not exit");
                    emaillogin.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
    public void inview() {
        dhAccount = findViewById(R.id.dhAccount);
        dhAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondLoingActivity.this, SignUpActivity.class));
                finish();
            }
        });
    }




}