package org.anms.dream;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class DonorReg extends AppCompatActivity {

    private EditText DonorRegEmail;
    private EditText DonorRegPass;
    private Button DonorRegButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_reg);

        Firebase.setAndroidContext(this);

        mAuth = FirebaseAuth.getInstance();

        DonorRegButton = findViewById(R.id.DonorRegButton);
        DonorRegEmail = findViewById(R.id.DonorRegEmail);
        DonorRegPass = findViewById(R.id.DonorRegPass);

        DonorRegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpDonor();
            }
        });
    }

    protected void signUpDonor() {
        final String email = DonorRegEmail.getText().toString();
        final String password = DonorRegPass.getText().toString();

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(DonorReg.this, "Fields are empty!", Toast.LENGTH_LONG).show();
        }
        else {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        startActivity(new Intent(DonorReg.this,DonorRegForm.class));
                    }
                    else {
                        Toast.makeText(DonorReg.this, "Sign Up Error : Email already exists!", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
}
