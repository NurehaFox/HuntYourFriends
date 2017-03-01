package com.example.conorsheridan.huntyourfriends;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Main2Activity extends Activity {
    
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
    }

   public void sendNorm(View view){
        Intent startNewActivity = new Intent(this,Main3Activity.class);
        startActivity(startNewActivity); 
    }
    
    public void sendAdv(View view){
        Intent startNewActivity = new Intent(this,Main4Activity.class);
        startActivity(startNewActivity);
    }
}

