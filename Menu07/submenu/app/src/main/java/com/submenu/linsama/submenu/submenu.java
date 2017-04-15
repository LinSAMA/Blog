package com.submenu.linsama.submenu;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.SubMenu;

public class submenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        SubMenu subMenu = menu.addSubMenu(R.string.title);
        subMenu.setIcon(android.R.drawable.ic_menu_search);
        subMenu.add(0,1,1,R.string.local);
        subMenu.add(0,2,2,R.string.network);
        return super.onCreateOptionsMenu(menu);
    }
}
