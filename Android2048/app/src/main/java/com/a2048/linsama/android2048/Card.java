package com.a2048.linsama.android2048;

/**
 * Created by lenovo on 2017/5/8.
 */

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Rambler on 2016/7/1.
 */
public class Card extends FrameLayout{

    private TextView label;
    private int num=0;
    public Card(Context context) {
        super(context);
        //设置卡片样式
        label = new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33FF8800);
        label.setGravity(Gravity.CENTER);
//        label.setText("2");

        //布局参数
        LayoutParams lp = new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);
        addView(label,lp);
        //卡片清零
//        setNum(0);
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
        if(num==0){
            label.setText("");
        }else {
            label.setText(num + "");
        }
        switch (num) {
            case 0:
                label.setBackgroundColor(0xffBDB76A);
                break;
            case 2:
                label.setBackgroundColor(0xffeee4da);
                break;
            case 4:
                label.setBackgroundColor(0xffede0c8);
                break;
            case 8:
                label.setBackgroundColor(0xfff2b179);
                break;
            case 16:
                label.setBackgroundColor(0xfff59563);
                break;
            case 32:
                label.setBackgroundColor(0xfff67c5f);
                break;
            case 64:
                label.setBackgroundColor(0xfff65e3b);
                break;
            case 128:
                label.setBackgroundColor(0xffedcf72);
                break;
            case 256:
                label.setBackgroundColor(0xffedcc61);
                break;
            case 512:
                label.setBackgroundColor(0xffedc850);
                break;
            case 1024:
                label.setBackgroundColor(0xffedc53f);
                break;
            case 2048:
                label.setBackgroundColor(0xffedc22e);
                break;
            default:
                label.setBackgroundColor(0xff3c3a32);
                break;
        }
    }
}
