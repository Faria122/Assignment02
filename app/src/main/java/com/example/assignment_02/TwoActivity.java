package com.example.assignment_02;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;  // button newr jonno import
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity {

    Button back;    // variable declare

    @Override
    // onCreate diye start hoy code

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        // --- Explicit intant --- Start

        back = findViewById(R.id.c5);   // R -> resource er id

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent ii = new Intent (TwoActivity.this,OneActivity.class);
                startActivity (new Intent (TwoActivity.this,OneActivity.class));
                //startActivity (new Intent (getApplicationContext(),TwoActivity.class));
                //Toast.makeText(getApplicationContext(),"click me", Toast.LENGTH_SHORT).show();// to make a toast


            }
        });




        // --- Explicit End


    } // second last bracet
}  // last bracet