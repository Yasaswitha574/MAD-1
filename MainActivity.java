package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
    }
    public void display(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.reva.edu.in"));
        startActivity(i);
    }

}
