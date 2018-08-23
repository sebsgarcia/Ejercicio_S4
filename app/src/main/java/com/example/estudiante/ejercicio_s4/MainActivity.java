package com.example.estudiante.ejercicio_s4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_mainToForm;
    private TextView tv_main_status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_mainToForm = findViewById(R.id.btn_mainToForm);
        tv_main_status = findViewById(R.id.tv_main_status);

        btn_mainToForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent solicitud = new Intent(getApplicationContext(),
                        UserFormActivity.class);

                /* Start activity */

                startActivityForResult(solicitud, Constants.REQ_NEW_USER);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}


