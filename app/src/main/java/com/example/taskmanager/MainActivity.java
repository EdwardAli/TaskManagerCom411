package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView C1,C2,C3,C4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        C1 = (CardView) findViewById(R.id.c1);
        C2 = (CardView) findViewById(R.id.c2);
        C3 = (CardView) findViewById(R.id.c3);
        C4 = (CardView) findViewById(R.id.c4);

        C1.setOnClickListener((View.OnClickListener) this);
        C2.setOnClickListener((View.OnClickListener) this);
        C3.setOnClickListener((View.OnClickListener) this);
        C4.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.c1: i = new Intent(this,c1.class); startActivity(i); break;
            case R.id.c2: i = new Intent(this,c2.class); startActivity(i); break;
            case R.id.c3: i = new Intent(this,c3.class); startActivity(i); break;
            case R.id.c4: i = new Intent(this,c4.class); startActivity(i); break;
        }
    }
}