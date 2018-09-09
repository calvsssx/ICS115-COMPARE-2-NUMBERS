package com.example.calfinnandjake.mysecondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressButton = (Button) findViewById(R.id.pressButton);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText1 = (EditText) findViewById(R.id.inputText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.inputText2);
                TextView viewOutput = (TextView) findViewById(R.id.viewOutput);

                int  first_num = Integer.parseInt(inputEditText1.getText().toString());

                int second_num = Integer.parseInt(inputEditText2.getText().toString());

                if (first_num>second_num){
                    viewOutput.append(first_num+" is greater than "+second_num);
                }
                else {
                    viewOutput.append(second_num+" is greater than "+first_num);
                }
            }
        });

    }
}
