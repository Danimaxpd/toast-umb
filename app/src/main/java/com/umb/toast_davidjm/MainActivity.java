package com.umb.toast_davidjm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Bienvenido a la App", Toast.LENGTH_SHORT).show();

        mBtnToast = (Button) findViewById(R.id.ButtonToast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bienvenidos UMB - David Jm", Toast.LENGTH_SHORT).show();
            }
        });



    }



}