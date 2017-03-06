package com.weight.linsama.a02weight;

import android.annotation.TargetApi;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/3/3.
 */

public class Result extends AppCompatActivity {
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.result);   /*取得Intent中Bundle对象*/
        Bundle bunde = this.getIntent().getExtras(); //取得Bundle对象中的数据
        String sex = bunde.getString("sex");
        double height = bunde.getDouble("height");

        //判断性别
        String sexText = "";
        if (sex.equals("M")) {
            sexText = "男性";
        } else {
            sexText = "女性";
        }

        //取得标准体重
        String weight = this.getWeight(sex, height);

        //设定输出文字
        TextView tv1 = (TextView) findViewById(R.id.text1);
        tv1.setText("你是一位" + sexText + "\n你的身高是" + height + "公分\n你的标准体重是" + weight + "公斤");
    }
    //四舍五入的method

  /*  private String format(double num) {
        NumberFormat formatter = new DecimalFormat("0.00");
        String s = formatter.format(num);
        return s;
    }  ?????*/

    //以finViewById()取得Button对象，onClickListenr
    private String getWeight(String sex, double height) {
        String weight ="";
        if (sex.equals("M")) {
            weight =(height - 80) * 0.7+"";
        } else {
            weight = (height - 70) * 0.6+"";
        }
        return weight;
    }
}
