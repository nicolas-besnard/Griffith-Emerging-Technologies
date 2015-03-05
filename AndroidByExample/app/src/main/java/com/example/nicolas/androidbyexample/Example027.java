package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Example027 extends ActionBarActivity {
    private TextView tv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example027);

        tv_display = (TextView) findViewById(R.id.tv_display);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example027, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // depending on the item that was selected change the text of the textview.
        // we must return true to indicate that the menu item has been handled
        if (id == R.id.action_settings) {
            tv_display.setText("You selected the action settings menu item");
            return true;
        } else if (id == R.id.mi_my_menu_item) {
            tv_display.setText("You selected the my menu item menu item");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
