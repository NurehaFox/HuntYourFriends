package com.example.conorsheridan.huntyourfriends;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void  btnMap2 (View view){
        Intent startNewActivity = new Intent(this,MapsActivity.class);
        startActivity(startNewActivity);
    }
}
