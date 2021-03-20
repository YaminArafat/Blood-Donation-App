package org.anms.dream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
<<<<<<< HEAD
=======
import android.widget.Toast;
>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a

import com.google.firebase.auth.FirebaseAuth;
<<<<<<< HEAD

public class donorlogin extends AppCompatActivity {

    private EditText donoremail;
    private EditText donorpass;
    private Button donorb;
    private Button newacc;
    private Button donorNewAcc;
    private FirebaseAuth firebaseAuth;
    //private FirebaseUser donor;
    private ProgressBar progressBar;
=======
import com.google.firebase.auth.FirebaseUser;

public class donorlogin extends AppCompatActivity {

    private EditText donorEmail, donorPass;
    private Button donorB, newAcc, donorNewAcc;

    private FirebaseAuth mAuth;
//    private FirebaseUser donor;

//    private ProgressBar progressBar;
>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorlogin);
<<<<<<< HEAD
        /*donoremail = findViewById(R.id.donorEmail);
        donorpass = findViewById(R.id.donorPass);
        donorb = findViewById(R.id.donorB);
        progressBar = findViewById(R.id.progressBar);

        /*donor = FirebaseAuth.getInstance().getCurrentUser();
        if(donor == null)
        {
            
        }*/
        /*firebaseAuth = FirebaseAuth.getInstance();
        donorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = donoremail.getText().toString().trim();
                String pass = donorpass.getText().toString().trim();
                if (!TextUtils.isEmpty(email))
                    if (!TextUtils.isEmpty(pass)) {
                        progressBar.setVisibility(View.VISIBLE);

                        firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()) {
                                    Toast.makeText(donorlogin.this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
                                } else {
                                    String e = task.getEx   ception().getMessage();
                                    Toast.makeText(donorlogin.this, "Registration Error : " + e, Toast.LENGTH_SHORT).show();
                                }
                                progressBar.setVisibility(View.INVISIBLE);

                            }
                        });

                    }
=======

        donorEmail = findViewById(R.id.donorEmail);
        donorPass = findViewById(R.id.donorPass);
        donorB = findViewById(R.id.donorB);
        donorNewAcc = findViewById(R.id.donorNewAcc);

//        progressBar = findViewById(R.id.progressBar);
        mAuth = FirebaseAuth.getInstance();
>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a

        donorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInDonor();
            }
<<<<<<< HEAD
        });*/
        donorNewAcc = findViewById(R.id.donorNewAcc);
=======
        });

>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a
        donorNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(donorlogin.this,DonorReg.class));
            }
        });
    }

    protected void signInDonor() {
        final String email = donorEmail.getText().toString();
        final String password = donorPass.getText().toString();

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(donorlogin.this, "Fill up the required informations.", Toast.LENGTH_LONG).show();
        }
        else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(donorlogin.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        //go next activity after signing in.
                        startActivity(new Intent(donorlogin.this, DonorHome.class));
                        Toast.makeText(donorlogin.this, "Sign In Successful!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(donorlogin.this, "Sign In Error. Try Again!", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
}
