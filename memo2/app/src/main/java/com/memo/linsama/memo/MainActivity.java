package com.memo.linsama.memo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
  //  private TextView mytext_1=null;
  //  private TextView mytext_2=null;
    private TextView rebuild = null;
    private String[] data={"备忘录","android"};
    private String[] data1={"备忘录","Linsama"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("备忘录");//设置标题
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);//icound的listView
        ListView listView = (ListView)findViewById(R.id.myListView_1);
        listView.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data1);//我的android的listview
        ListView listView1 =(ListView)findViewById(R.id.myListView_2);
        listView1.setAdapter(adapter1);
       // mytext_1=(TextView)this.findViewById(R.id.myListView_1);//获取TextView组件
      /*  mytext_1.setOnClickListener(new View.OnClickListener() {//设置点击事件
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();//设置Intent对象要启动的Activity
                intent.setClass(MainActivity.this,subpage.class);
                startActivity(intent);

            }
        });*/
        rebuild=(TextView)this.findViewById(R.id.rebuild);//获取新建文件的textView组件
        rebuild.setOnClickListener(new View.OnClickListener() {//设置上下文菜单监听事件
            @Override
            public void onClick(View v) {
                rebuild.showContextMenu();
            }
        });
        rebuild.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                menu.setHeaderTitle("新建文件夹");//定义显示信息头
                menu.add(Menu.NONE,Menu.FIRST+1,1,"ICloud");//定义菜单项
                menu.add(Menu.NONE,Menu.FIRST+2,2,"我的Android");//同上
                menu.add(Menu.NONE,Menu.FIRST+3,3,"取消");
            }
        });
    }
    protected void dialog(){
        LayoutInflater factory = LayoutInflater.from(MainActivity.this);
        View myView = factory.inflate(R.layout.edit_dialog,null);
        Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("新建文件夹");
        dialog.setMessage("请为此文件夹输入名称");
        dialog.setView(myView);
        dialog.setPositiveButton("储存", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.create();
        dialog.show();
    }
    public boolean onContextItemSelected(MenuItem item){//选中后的提示
        switch(item.getItemId()){
            case Menu.FIRST+1:

                Toast.makeText(this,"您选择的是ICloud项",Toast.LENGTH_LONG).show();
                dialog();

                break;
            case Menu.FIRST+2:
                Toast.makeText(this,"您的选择是我的Android项",Toast.LENGTH_LONG).show();
                dialog();
                break;
        }
        return false;
    }
}
