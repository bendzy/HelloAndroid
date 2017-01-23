package com.example.bendz.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        //Send Error message to our user of app
        Toast.makeText(this,"Can you see me",Toast.LENGTH_SHORT).show();

        Log.i("info","Done creating the app");
    }
}
