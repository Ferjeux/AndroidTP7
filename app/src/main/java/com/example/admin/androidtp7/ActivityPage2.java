package com.example.admin.androidtp7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPage2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //on récupère l'intenet qui a lancé cette activité
        Intent intent = getIntent();
        Boolean rep = intent.getBooleanExtra("param", false);
        TextView editText = ((TextView) findViewById(R.id.reponse));
        if (rep == true){
            editText.setText(R.string.juste);
        }
        else{
            editText.setText(R.string.faux);
        }


    }
}
