package com.example.assignment_02;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;  // button newr jonno import

public class OneActivity extends AppCompatActivity {

    Button b_one;    // variable declare
    Button b_two;
    Button b_three;    // variable declare
    Button b_four;    // variable declare

    @Override
    // onCreate diye start hoy code

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        // --- Explicit intant --- Start

        b_one = findViewById(R.id.b1);   // R -> resource er id
        b_two = findViewById(R.id.b2);
        b_three = findViewById(R.id.b3);
        b_four = findViewById(R.id.b4);

        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent (OneActivity.this,TwoActivity.class);
                startActivity (ii);

            }
        });
        // --- Explicit --- End
        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent (OneActivity.this,ThreeActivity.class);
                startActivity (iii);

            }
        });

        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent (OneActivity.this,FourActivity.class);
                startActivity (iv);

            }
        });
        b_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vi = new Intent (OneActivity.this,FiveActivity.class);
                startActivity (vi);

            }
        });


    } // second last bracet
}  // last bracet