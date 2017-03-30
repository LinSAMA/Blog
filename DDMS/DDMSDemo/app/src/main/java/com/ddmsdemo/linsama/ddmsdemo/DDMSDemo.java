package com.ddmsdemo.linsama.ddmsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.DynamicDrawableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DDMSDemo extends AppCompatActivity {
    private static final String ACTIVITY_TAG="DDMSDemo";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddmsdemo);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Log.v(DDMSDemo.ACTIVITY_TAG,"This is Verbose");
                Log.d(DDMSDemo.ACTIVITY_TAG,"This is Debug");
                Log.i(DDMSDemo.ACTIVITY_TAG,"This is Information");
                Log.w(DDMSDemo.ACTIVITY_TAG,"This is Warnning");
                Log.e(DDMSDemo.ACTIVITY_TAG,"This is Error");
            }
        });
    }
}
