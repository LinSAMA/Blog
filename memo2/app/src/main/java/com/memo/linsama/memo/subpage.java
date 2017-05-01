package com.memo.linsama.memo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by lenovo on 2017/4/15.
 */

public class subpage extends Activity {
    private Intent intent;
    private Bundle bundle;
    private ImageView build;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.subpage);
        build = (ImageView)this.findViewById(R.id.add);//获取组件
        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();////设置Intent对象要启动的Activity
                intent.setClass(subpage.this,Edit.class);
                startActivity(intent);
            }
        });
    }

}
