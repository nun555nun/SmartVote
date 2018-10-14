package com.example.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = findViewById(R.id.editText);
                String id =e.getText().toString();
                if(id.length()==13){
                    String msg = "";
                    if(id.equals("1111111111111")||id.equals("2222222222222")){
                        msg="คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    }
                    else{
                        msg="คุณไม่มีสิทธิเลือกตั้ง";
                    }
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage(msg)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .show();
                }
                else{
                    Toast.makeText(MainActivity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
