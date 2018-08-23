package com.example.estudiante.ejercicio_s4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    private EditText edtUserFormName;
    private EditText edtUserFormEmail;
    private EditText edtUserFormUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

       // Intent solicitud = getIntent();


        edtUserFormName = findViewById(R.id.edt_userform_name);
        edtUserFormEmail = findViewById(R.id.edt_userform_email);
        edtUserFormUsername = findViewById(R.id.edt_userform_username );

    }
}
