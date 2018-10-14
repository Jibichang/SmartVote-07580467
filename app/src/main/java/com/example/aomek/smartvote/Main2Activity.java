package com.example.aomek.smartvote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //int id = Integer.parseInt(IDEditText.getText().toString());

        //String convert = String.valueOf(length);
        Toast t = Toast.makeText(this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_SHORT);
        Button IDButton = findViewById(R.id.ID_button);
        IDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText IDEditText = findViewById(R.id.ID_editText);
                //int id = Integer.parseInt(IDEditText.getText().toString());
                //int length = IDEditText.length();

                int lenght = (int)callength(IDEditText);
                //int lenght = 13;
                String resultText = null;
                if (lenght < 13) {
                    Toast.makeText(
                            Main2Activity.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG
                    ).show();
                } else {
                    String text = IDEditText.getText().toString();
                    if (text.equals("1111111111111") ){
                        resultText = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    } else if (text.equals("2222222222222")) {
                        resultText = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    } else {
                        resultText = "คุณไม่มีสิทธิเลือกตั้ง";
                    }

                    String msg = resultText;

                    new AlertDialog.Builder(Main2Activity.this)
                            .setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage(msg)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //todo: โค้ดที่ให้ทำ เมื่อ user คลิก OK ในไดอะล็อก
                                }
                            })
                            .show();
                }

            }
        });

    }

    private float callength(EditText text) {
        // สูตรคำนวณ bmi = kg / m^2
        int length = text.length();
        return length;
    }
}
