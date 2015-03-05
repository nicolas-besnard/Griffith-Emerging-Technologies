package com.example.nicolas.androidbyexample;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Example006 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example006);

        // 1

        // get access to the string array and construct a string from all three of its elements
        Resources resources = getResources();
        TypedArray ta_string_array = resources.obtainTypedArray(R.array.my_string_array);
        String s = ta_string_array.getString(0) + ", " + ta_string_array.getString(1) + ", " + ta_string_array.getString(2);

        // get the textview and set the string
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(s);

        // 2

        TypedArray ta_int_array = resources.obtainTypedArray(R.array.int_array);
        TypedArray ta_float_array = resources.obtainTypedArray(R.array.float_array);

        // construct strings for displaying arrray contents
        String s1 = ta_int_array.getInt(0, 0) + ", " + ta_int_array.getInt(1, 0) + ", " + ta_int_array.getInt(2, 0);
        String s2 = ta_float_array.getFloat(0, 0) + ", " + ta_float_array.getFloat(1, 0) + ", " + ta_float_array.getFloat(2, 0);

        // get the textview and set the string
        TextView tv2 = (TextView) findViewById(R.id.textview2);
        tv2.setText(s1);

        // get the textview and set the string
        TextView tv3 = (TextView) findViewById(R.id.textview3);
        tv3.setText(s2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example006, menu);
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
