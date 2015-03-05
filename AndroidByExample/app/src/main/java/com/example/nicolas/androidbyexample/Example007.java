package com.example.nicolas.androidbyexample;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Example007 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example007);

        // get the textview and set its background colour
        Resources resources = getResources();
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setBackgroundColor(resources.getColor(R.color.my_red));

        TextView tv2 = (TextView) findViewById(R.id.textview2);
        tv2.setBackgroundColor(resources.getColor(R.color.my_blue));

        TextView tv3 = (TextView) findViewById(R.id.textview3);
        tv3.setBackgroundColor(resources.getColor(R.color.my_green));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example007, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
