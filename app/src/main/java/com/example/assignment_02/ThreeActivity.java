
package com.example.assignment_02;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;  // button newr jonno import

public class ThreeActivity extends AppCompatActivity {

    Button b_three;    // variable declare

    @Override
    // onCreate diye start hoy code

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_activity);
        // --- Explicit intant --- Start

        b_three = findViewById(R.id.b3);   // R -> resource er id

        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent (ThreeActivity.this,OneActivity.class);
                startActivity (ii);

            }
        });




        // --- Explicit --- End


    } // second last bracet
}  // last bracet