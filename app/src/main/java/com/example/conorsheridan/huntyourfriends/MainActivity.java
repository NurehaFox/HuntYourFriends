package com.example.conorsheridan.huntyourfriends;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.Manifest;


public class MainActivity extends Activity {
    
    MediaPlayer mediaPlayer;
        
    Button b1;
    
    Typeface din;
    
    

        

        
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
        
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
       
        
        b1 = (Button) findViewById(R.id.button);
        
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        
        b1.setTypeface(din);
    }
    
 

    
    public void sendMessage(View view){
        Intent startNewActivity = new Intent(this,Main2Activity.class);
        startActivity(startNewActivity);
    }


}
