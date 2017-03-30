package com.ddms05.linsama.ddms05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DDMS05 extends AppCompatActivity {
    static final String LIFT_TAG="DDMS05";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddms05);

        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onCreate");
        Button button = (Button)findViewById(R.id.button);
        button.setText("next activity");
        button.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent= new Intent();
            intent.setClass(DDMS05.this,DDMS05_2.class);
            DDMS05.this.startActivity(intent);
        }
    }
    protected void onStop(){
        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onStop");
        super.onStop();
    }
    protected void onDestroy(){
        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onDestroy");
        super.onStop();
    }
    protected void onResume(){
        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onResume");
        super.onStop();
    }
    protected void onPause(){
        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onPause");
        super.onStop();
    }
    protected void onStart(){
        Log.v(DDMS05.LIFT_TAG,"FirstActivity -> onStart");
        super.onStop();
    }
}
