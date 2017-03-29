package com.intent.linsama.intent04;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Intent04 extends AppCompatActivity {
    RadioGroup radioGroup = null;
    RadioButton Rad1 = null;
    RadioButton Rad2 = null;
    RadioButton Rad3 = null;
    RadioButton Rad4 = null;
    RadioButton currentRaioButton = null;
    Button btnsure;
    Button btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent04);

        //获得单选按钮组
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        //获得单选按钮
        Rad1 = (RadioButton)findViewById(R.id.Rad1);
        Rad2 = (RadioButton)findViewById(R.id.Rad2);
        Rad3 = (RadioButton)findViewById(R.id.Rad3);
        Rad4 = (RadioButton)findViewById(R.id.Rad4);
        Rad1.setClickable(true);

        //监听单选按钮组
       // radioGroup.setOnCheckedChangeListener(mChangeRadio);
        btnsure = (Button)findViewById(R.id.btnsure);
        btncancel = (Button)findViewById(R.id.btncancel);
        btnsure.setOnClickListener(new btnsure());
        btncancel.setOnClickListener(new btncancel());
    }

 /*   class btnsure implements View.OnClickListener{
        public void onClick(View v){
            if(currentRaioButton.getText().equals("in")){
                setTitle("your choice is right!");
            }else{
                setTitle("your choice is wrong!");
            }
        }
    }*/
    class btnsure implements View.OnClickListener{//按钮事件监听器类，实现OnClickListener接口
        public void onClick(View v){//实现OnClickListener接口中的onClick方法
            String ans = "";
            if(Rad1.isChecked()){
                ans = "on";
            }else if(Rad2.isChecked()){
                ans = "at";
            }else if(Rad3.isChecked()){
                ans = "of";
            }else if(Rad4.isChecked()){
                ans = "in";
            }
            //new一个Intent对象，并指定class
            Intent intent = new Intent();
            //设置Intent对象要启动Activity
            intent.setClass(Intent04.this,other.class);
            //new一个Bundle对象，并将要传递的数据传入
            Bundle bundle = new Bundle();
            bundle.putString("ans",ans);
            //将Bundle对象assign给Intent
            intent.putExtras(bundle);
            //通过Intent对象启动另外一个Activity
            startActivityForResult(intent,0);
        }
    }
    class btncancel implements View.OnClickListener{
        public void onClick(View v){
            radioGroup.clearCheck();
            setTitle("");
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 0&&resultCode == 0){
            Bundle bundle = data.getExtras();
            String ans = bundle.getString("ans");
        }
    }
}
 /*       public void onClick(View v){
            radioGroup.clearCheck();
            setTitlte("");
        }
    }
    private RadioGroup.OnCheckedChangeListener mChangeRadio = new RadioGroup.OnCheckedChangeListener(){
        public void onCheckedChanged(RadioGroup group,int checkedID){
            if(checkedID == Rad1.getId()){//获得按钮的名称
                currentRaioButton = Rad1;
            }else if(checkedID == Rad2.getId()){
                currentRaioButton = Rad2;
            }else if(checkedID == Rad3.getId()){
                currentRaioButton = Rad3;
            }else if(checkedID == Rad4.getId()){
                currentRaioButton = Rad4;
            }
        }
    };
}*/
