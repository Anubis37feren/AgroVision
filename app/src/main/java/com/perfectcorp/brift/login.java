package com.perfectcorp.brift;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class login extends AppCompatActivity {

    Button Sconnecter;
    TextView textconnect;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://agrovision-8de80-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText email = findViewById(R.id.Emaill);
        final EditText passWord = findViewById(R.id.password);













































        Sconnecter = findViewById(R.id.sconnecter);
        textconnect = findViewById(R.id.textconnect);

        Sconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String emailText = email.getText().toString();
                final String passwordText = passWord.getText().toString();

                if(emailText.isEmpty() || passwordText.isEmpty()){
                    Toast.makeText(login.this, "entrez votre E-mail ou mot de passe !!", Toast.LENGTH_SHORT).show();
                }else {
                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if(snapshot.hasChild(emailText)){
                                final String getPassword = snapshot.child(emailText).child("password").getValue(String.class);


                            if(getPassword.equals(passwordText)){
                                Toast.makeText(login.this, "connection reussi !!", Toast.LENGTH_SHORT).show();
                                finish();
                            }else{
                                Toast.makeText(login.this, "connection échoue !!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                                Toast.makeText(login.this, "connection échoue !!", Toast.LENGTH_SHORT).show();

                            }  }


                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }





              //  Intent call = new Intent(getApplicationContext(), accueil.class);
               // startActivity(call);
                //finish();
    }

    });

        textconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), register.class);
                startActivity(call);
                finish();
            }

        });
}}