package com.bradteachescode.workingwithbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv1, tv2, tv3, tv4;
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("Inside the OnCreate");
            }
        });

        btn3.setOnClickListener((View.OnClickListener) this);

        btn4.setOnClickListener(this);

    }


    public void btn1_click(View view) {
        tv1.setText("From XML");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn3:
                tv3.setText("From SWITCH");
                break;

            case R.id.btn4:
                tv4.setText("From SWITCH");
                break;


        }
    }
}
