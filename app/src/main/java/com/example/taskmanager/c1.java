package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class c1 extends AppCompatActivity {
    private FloatingActionButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);

        button = (FloatingActionButton) findViewById(R.id.addFloatingButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn(add_goal.class);
            }
        });
    }
        public void btn(Class classf)
        {
            Intent intent = new Intent(getApplicationContext(),classf );
            startActivity(intent);
            finish();
        }

}