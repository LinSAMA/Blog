package com.intent.linsama.intent04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/3/23.
 */

public class other extends Activity{
    private Intent intent;
    private Button button;


    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.other);
        //取得Intent中的Bundle对象
        Bundle bundle = this.getIntent().getExtras();
        //取得Bundle对象中的数据
        String ans = bundle.getString("ans");
        //判断所选的答案
        String sexText = "";
        if(ans.equals("in")){
            sexText = "right";
        }else{
            sexText = "wrong";
        }
        TextView tv1 = (TextView)findViewById(R.id.text1);
        tv1.setText("The answer what you choice is:" + sexText);

        //以findViewByID()取得Button对象，并添加onClickListener
        Button buttonBack = (Button)findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //返回result回上一个activity
                other.this.setResult(RESULT_OK,intent);
                //结束这个activity
                other.this.finish();
            }
        });
    }

}
