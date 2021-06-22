package com.example.parcelable_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pacelable data = new pacelable(101,"make");
        intent = new Intent(this,MainActivity2.class);
        intent.putExtra("data",data);
    }

    public void button1_clicked(View v){
        startActivity(intent);
    }
}