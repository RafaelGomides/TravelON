package com.on.owl.travelon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actWellcome();

    }

    public void actWellcome() {

        Intent intWellcome = new Intent(this, WellcomeScreen.class);
        startActivity(intWellcome);

    }

}
