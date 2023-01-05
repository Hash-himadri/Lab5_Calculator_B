package com.himadri_parikh.lab5_calculator_b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Step 1 - Create local variable /instantiation
    EditText edtN1, edtN2;
    Button btnA, btnS, btnM, btnD;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding views - all 7 views components
        edtN1 = findViewById(R.id.edtNum1);
        edtN1 = findViewById(R.id.edtNum2);
        btnA = findViewById(R.id.btnAdd);
        btnS = findViewById(R.id.btnSub);
        btnM = findViewById(R.id.btnMul);
        btnD = findViewById(R.id.btnDiv);
        tvRes = findViewById(R.id.tvResult);

        //Step 3 - implement listener
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(edtN1.getText().toString());
                int n2 = Integer.parseInt(edtN2.getText().toString());
                int res = n1+n2;

                tvRes.setText(String.valueOf(res));
            }
        });
    }
}