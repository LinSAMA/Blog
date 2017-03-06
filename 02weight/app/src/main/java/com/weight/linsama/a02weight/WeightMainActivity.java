package com.weight.linsama.a02weight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class WeightMainActivity extends AppCompatActivity {
    public static String sex = "";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* 载入weight_main.xml Layout */
        setContentView(R.layout.weight_main);
        /* 以finViewById()取得Button对象，并加入onClickListener */
        Button b1 = (Button)findViewById(R.id.btn_calculate);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText et = (EditText)findViewById(R.id.et_height);

                double height = Double.parseDouble(et.getText().toString());
                /*  取得选择的性别 */
                RadioGroup rg = (RadioGroup)findViewById(R.id.rg_sex);
                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if(checkedId == R.id.rb_male){
                            sex = "M";
                        }
                        else{
                            sex = "F";
                        }
                    }
                });
                /*  new一个Intent对象，并指定class  */
                Intent intent = new Intent();
                intent.setClass(WeightMainActivity.this,Result.class);
                /*  new一个bundle对象，并将要上传的数据传入 */
                Bundle bundle = new Bundle();
                bundle.putDouble("height",height);
                bundle.putString("sex",sex);
                /* 将Bundle对象assign给Intent  */
                intent.putExtras(bundle);
                /* 调用Ativity */
                startActivity(intent);
            }
        });
    }
}
