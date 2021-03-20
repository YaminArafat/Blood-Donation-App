package org.anms.dream;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

import static java.util.Objects.*;

public class DonorRegForm extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
<<<<<<< HEAD

=======
   /* private FirebaseAuth firebaseAuth;
    private EditText donrRegEmail;
    private EditText first_name;
    private EditText last_name;

    private EditText donrRegPass;
    private EditText donorRegConfirmPass;
    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6;
    String datearr[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String montharr[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    String yeararr[2000]
    for(int i=0;i<50;i++)
    {
        int x=i+1970;
        yeararr[i]=toString(x);
    }
    ArrayAdapter<String> adapter;*/
>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_reg_form);

<<<<<<< HEAD

=======
        /*first_name = findViewById(R.id.first_name);
        String name1 = first_name.getText().toString().trim();
        last_name = findViewById(R.id.last_name);
        String name2 = last_name.getText().toString().trim();

        String user_name=name1+" "+name2;

        radioGroup =findViewById(R.id.radiogroup1);

        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(radioId);

        String gender = radioButton.getText().toString().trim();

        radioGroup = findViewById(R.id.radiogroup2);

        radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        String bloodgroup = radioButton.getText().toString().trim();

        spinner1 = findViewById(R.id.spinner1);

        spinner1.setAdapter(adapter);
        String date,month,year;

        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                date = datearr[position];

            }
        });

        donrRegEmail = findViewById(R.id.donrRegEmail);
        String email = donrRegEmail.getText().toString().trim();
        donrRegPass = findViewById(R.id.donorRegPass);
        String pass = donrRegPass.getText().toString().trim();
        donorRegConfirmPass = findViewById(R.id.donorRegConfirmPass);
        String confirmpass = donorRegConfirmPass.getText().toString().trim();



        if (pass == confirmpass)
        {

        }
        else
        {

        }*/
        //radioGroup =findViewById(R.id.radiogroup1);
        //Toast.makeText(getBaseContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();

        /*String email = donoremail.getText().toString().trim();
        String pass = donorpass.getText().toString().trim();


        firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCanceledListener(new OnCompleteListener<>() {
            @Override
            public void onComplete(@NonNull Task task) {
                if(task.isSuccessful()) {
                    Toast.makeText(this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Registration Error", Toast.LENGTH_SHORT).show();
                }
            }
        })*/
>>>>>>> 9af9301186e29326b3aa6e53c2e3dc53ce39424a

    }
    public void checkbutton(View V)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(radioId);
    }
}
