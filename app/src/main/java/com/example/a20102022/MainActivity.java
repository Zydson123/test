package com.example.a20102022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button CheckBtn;
    Button helpBtn;
    RadioGroup Answers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBtn = findViewById(R.id.button);
        helpBtn = findViewById(R.id.button2);
        CheckBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(check()){
                            Toast.makeText(MainActivity.this,
                                    R.string.good,
                                    Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,
                                    R.string.wrong,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        helpBtn.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PowdpowiedzActivity.class);
                //intencja jawna, wiadomo skąd dokąd
                startActivity(intent);
            }
        });
    }

    public boolean check(){
        Answers = findViewById(R.id.radioGroup);
        int radioId = Answers.getCheckedRadioButtonId();
        return radioId == R.id.radioButton1;
    }
}