package com.example.laborator_tema3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String recData=getIntent().getStringExtra("input_data");
        TextView textView=findViewById(R.id.textView);
        textView.setText(recData);
    }
    public void onClickAct(View view){
        Intent intent_2 = new Intent(this, MainActivity.class);
        startActivity(intent_2);
    }
}