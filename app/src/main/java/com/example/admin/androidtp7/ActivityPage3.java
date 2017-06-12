package com.example.admin.androidtp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        //on récupère l'intenet qui a lancé cette activité
        Intent intent = getIntent();
        Boolean rep = intent.getBooleanExtra("second", false);
        TextView editText = ((TextView) findViewById(R.id.reponseD));
        if (rep == true){
            editText.setText(R.string.reponseD);
        }
        else{
            editText.setText(R.string.faux);
        }
    }
}
