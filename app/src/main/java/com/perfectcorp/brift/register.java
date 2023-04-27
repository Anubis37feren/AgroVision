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




public class register extends AppCompatActivity {

    Button reate;
    TextView textconnect1;


    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://agrovision-8de80-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText pseudo = findViewById(R.id.spseud) ;
        final EditText email =findViewById(R.id.semail)  ;
        final EditText motDePasse = findViewById(R.id.spassword) ;
        final EditText sPassword = findViewById(R.id.cspassword);
        final EditText Phone = findViewById(R.id.phone);












        reate = findViewById(R.id.create);
        textconnect1= findViewById(R.id.textconnect1);

        reate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String name =  pseudo.getText().toString();
                final String Email = email.getText().toString();
                final String phone = Phone.getText().toString();
                final String pass = motDePasse.getText().toString();
                final String psass = sPassword.getText().toString();


                if(name.isEmpty() || Email.isEmpty() || pass.isEmpty()){
                    Toast.makeText(register.this, "entrez votre pseudo, E-mail et mot de passe !!", Toast.LENGTH_SHORT).show();
                }else if(!pass.equals(psass)){
                    Toast.makeText(register.this, "les mots de passe ne sont pas identiques !!", Toast.LENGTH_SHORT).show();
                } else{
                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            if(snapshot.hasChild(phone)){
                                Toast.makeText(register.this, "le numéro est enregistre !!", Toast.LENGTH_SHORT).show();
                            }else{
                                databaseReference.child("users").child(phone).child("name").setValue(name);
                                databaseReference.child("users").child(phone).child("email").setValue(Email);
                                databaseReference.child("users").child(phone).child("password").setValue(pass);

                                Toast.makeText(register.this, "enregistrement reussi !!", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        }

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


        textconnect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), login.class);
                startActivity(call);
                finish();
            }

        });
    }
}