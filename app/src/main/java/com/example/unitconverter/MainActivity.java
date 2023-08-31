package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button miles;
    private Button kilometer;
    private Button pounds;
    private Button kilogm;
    private EditText valu;
    private TextView op;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op=findViewById(R.id.textView2);
        valu=findViewById(R.id.value);
        miles=findViewById(R.id.button);
        kilometer=findViewById(R.id.button2);
        pounds=findViewById(R.id.button3);
        kilogm=findViewById(R.id.button4);

        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=valu.getText().toString();
                int num=Integer.parseInt(s);
                float mile= (float) (num * 0.6213);
                op.setText(mile + " "+"mile");
            }
        });

        kilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=valu.getText().toString();
                int num=Integer.parseInt(s);
                float km= (float) (num * 1.6);
                op.setText(km + " "+"Kilometer");
            }
        });

        pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=valu.getText().toString();
                int num=Integer.parseInt(s);
                float pound= (float) (num * 2.2);
                op.setText(pound + " "+"Pounds");
            }
        });

        kilogm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=valu.getText().toString();
                int num=Integer.parseInt(s);
                float kg= (float) (num/2.2046);
                op.setText(kg + " "+"Kilograms");
            }
        });



    }
}