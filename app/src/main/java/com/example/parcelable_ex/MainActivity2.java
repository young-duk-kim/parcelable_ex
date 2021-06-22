package com.example.parcelable_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        pacelable data = bundle.getParcelable("data");

        Toast.makeText(this,data.msg,Toast.LENGTH_LONG).show();
        TextView textView = findViewById(R.id.textView);
        textView.setText(data.msg);
    }
}