package com.contentmenu.linsama.contentmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class ContentMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_menu);

        TextView tx = new TextView(this);
        tx.setText("上下文菜单的载体");
        registerForContextMenu(tx);
        setContentView(tx);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        menu.add(0,1,1,R.string.newf);
        menu.add(0,2,2,R.string.open);
        super.onCreateContextMenu(menu,v,menuInfo);
    }
    public boolean onContextItemSelected(MenuItem item){
        super.onContextItemSelected(item);
        switch(item.getItemId()) {
            case 1:
                break;
            case 2:
                break;
        }
        return super.onContextItemSelected(item);
    }
}
