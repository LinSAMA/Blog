package com.ddms05.linsama.ddms05;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by lenovo on 2017/3/30.
 */

public class DDMS05_2 extends Activity {
    private static final String LIFT_TAG="DDMS05";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(DDMS05.LIFT_TAG, "SecondActivity -> onCreate");
    }
    protected void onStop(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onStop");
        super.onStop();
    }
    protected void onDestroy(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onDestroy");
        super.onStop();
    }
    protected void onResume(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onResume");
        super.onStop();
    }
    protected void onPause(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onPause");
        super.onStop();
    }
    protected void onStart(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onStart");
        super.onStop();
    }
    protected void onRestart(){
        Log.v(DDMS05.LIFT_TAG,"SecondActivity -> onRestart");
        super.onStop();
    }
}
