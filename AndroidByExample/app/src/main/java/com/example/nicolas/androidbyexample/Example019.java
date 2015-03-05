package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Example019 extends ActionBarActivity {
    // private fields for the checkbox and textview
    private TextView tv_display;
    private CheckBox cb_clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example019);

        // pull the textview and the checkbox from the XML
        tv_display = (TextView) findViewById(R.id.tv_display);
        cb_clickme = (CheckBox) findViewById(R.id.cb_clickme);

        // add an on click listener to the check box
        cb_clickme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            // implementation of on checked change function that is required
            public void onCheckedChanged(CompoundButton button, boolean state) {
                if(state == true)
                    tv_display.setText(R.string.tv_on);
                else
                    tv_display.setText(R.string.tv_off);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example019, menu);
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
