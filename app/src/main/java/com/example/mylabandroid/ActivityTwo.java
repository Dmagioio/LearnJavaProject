package com.example.mylabandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {
    String s = "відповідь прийнято";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btn = findViewById(R.id.btnActThree);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnActThree) {
            Intent intent = new Intent(this, ActivityThree.class);
            startActivity(intent);
        }
    }
    public void addPointA(View v) {
        display(s);
    }
    public void addPointB(View v) {
        display(s);
    }
    public void addPointC(View v) {
        display(s);
    }
    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        scoreView.setText(String.valueOf(s));
    }
}