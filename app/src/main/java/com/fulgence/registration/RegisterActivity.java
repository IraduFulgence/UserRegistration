package com.fulgence.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
EditText fname,lastname,email,username;
EditText password,confpassword;
private Button btn;
String firstnam,lastnam,usernam,passwor1,passwor2,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fname = findViewById(R.id.txt1);
        lastname = findViewById(R.id.txt2);
        username = findViewById(R.id.txt3);
        email = findViewById(R.id.email);

        password = findViewById(R.id.pass);
        confpassword = findViewById(R.id.passs);

       btn= findViewById(R.id.btn2);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               firstnam = fname.getText().toString();
               lastnam = lastname.getText().toString();
               usernam = username.getText().toString();
               mail = email.getText().toString();
               passwor1 = password.getText().toString();
               passwor2 = confpassword.getText().toString();
               //validating user's inputs
               if (TextUtils.isEmpty(firstnam)) {
                   fname.setError("no first name");
                   return;
               } else if (TextUtils.isEmpty(lastnam)) {
                   lastname.setError("fill this field please!");
                   return;
               } else if (TextUtils.isEmpty(usernam)) {
                   username.setError("provide username");
                   return;
               } else if (TextUtils.isEmpty(mail)) {
                   email.setError("provide email");
                   return;
               } //else if (!emailPattern.equals(mail)) {
               // email.setError("invalid email");
               //return;
               //}
               else if (TextUtils.isEmpty(passwor1)) {
                   password.setError("provide password");
                   return;
               }
               else if (passwor1.length() < 6 || passwor1.length() > 32) {
                   password.setError("password is invalid");
                   return;
               }
               else if (!passwor2.equals(passwor1)) {
                   confpassword.setError("password mismatch!");
                   return;
               }
           }

       });




}}



