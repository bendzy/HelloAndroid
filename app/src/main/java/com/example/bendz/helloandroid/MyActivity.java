package com.example.bendz.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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


    public void topClick(View v) {
        Toast.makeText(this,"Top button clicked",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button");
    }

    public void bottomClick(View v) {
        Toast.makeText(this,"Bottom button clicked",Toast.LENGTH_SHORT).show();
        Log.i("info","The user has clicked bottom button");
    }
}
