package com.example.admin.androidtp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BOUTON", "button2");
                Intent intent = new Intent (MainActivity.this, ActivityPage2.class);
                intent.putExtra("param",false);
                startActivity(intent);
            }
        });

    }

    public void button1(View view) {
        Log.d("BOUTON", "button2");
        Intent intent = new Intent (MainActivity.this, ActivityPage2.class);
        intent.putExtra("param", true);
        startActivity(intent);
    }


    public void rep1(View view) {
        Log.d("BOUTON", "rep1");
        Intent intent = new Intent (MainActivity.this, ActivityPage3.class);
        intent.putExtra("second", false);
        startActivity(intent);

    }


    public void rep2(View view) {
        Log.d("BOUTON", "rep1");
        Intent intent = new Intent (MainActivity.this, ActivityPage3.class);
        intent.putExtra("second", true);
        startActivity(intent);
    }

    public void rep3(View view) {
        Log.d("BOUTON", "rep1");
        Intent intent = new Intent (MainActivity.this, ActivityPage3.class);
        intent.putExtra("second", false);
        startActivity(intent);
    }

    public void rep4(View view) {
        Log.d("BOUTON", "rep1");
        Intent intent = new Intent (MainActivity.this, ActivityPage3.class);
        intent.putExtra("second", false);
        startActivity(intent);
    }
}
