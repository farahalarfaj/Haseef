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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

 /*   EditText registerFullName, registerPassword, registerEmail, registerConfPass;
    Button registerUserBtn,gotoLogin;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        registerFullName = findViewById(R.id.registerFullName);
        registerPassword = findViewById(R.id.registerPassword);
        registerEmail = findViewById(R.id.registerEmail);
        registerConfPass = findViewById(R.id.confPassword);
        registerUserBtn = findViewById(R.id.registerBtn);
        gotoLogin = findViewById(R.id.gotoLogin);

        fAuth = FirebaseAuth.getInstance();
        gotoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
        });

        registerUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FullName= registerFullName.getText().toString();
                String Password= registerPassword.getText().toString();
                String Email= registerEmail.getText().toString();
                String ConfPass= registerConfPass.getText().toString();

                if(FullName.isEmpty()){
                    registerFullName.setError("error");
                    return;
                }
                if(Password.isEmpty()){
                    registerPassword.setError("error");
                    return;
                }
                if(Email.isEmpty()){
                    registerEmail.setError("error");
                    return;
                }
                if(ConfPass.isEmpty()){
                    registerConfPass.setError("error");
                    return;
                }
                if(!Password.equals(ConfPass)){
                    registerConfPass.setError("not match");
                    return;
                }
                Toast.makeText(register.this,"data valid",Toast.LENGTH_SHORT).show();
                fAuth.createUserWithEmailAndPassword(Email, Password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        startActivity(new Intent(getApplicationContext(),HomeStaff.class));
                        finish();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(register.this, e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });








            }
        });





    }*/
}