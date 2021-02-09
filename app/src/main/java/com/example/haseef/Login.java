package com.example.haseef;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {

    EditText Username, Password;
    Button createAccountBtn, loginBtn;
    //FirebaseAuth firebaseAuth1;
     FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // getSupportActionBar().hide();
       // createAccountBtn = findViewById(R.id.createAccountBtn);
       // firebaseAuth1 = FirebaseAuth.getInstance();
        firebaseAuth=FirebaseAuth.getInstance();
       /* createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), register.class));


            }
        });*/

        Username = findViewById(R.id.loginEmail);
        Password = findViewById(R.id.loginPassword);
        loginBtn = findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Username.getText().toString().isEmpty()) {
                    Username.setError("error");
                    return;
                }
                if (Password.getText().toString().isEmpty()) {
                    Password.setError("error password");
                    return;
                }

                //firebaseAuth1.signInWithEmailAndPassword(Username.getText().toString(), Password.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                firebaseAuth.signInWithEmailAndPassword(Username.getText().toString(), Password.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {


                    @Override
                    public void onSuccess(AuthResult authResult) {
                        startActivity(new Intent(getApplicationContext(), HomeStaff.class));
                        finish();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }
}
