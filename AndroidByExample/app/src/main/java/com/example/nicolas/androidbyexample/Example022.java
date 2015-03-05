package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.NumberPicker;
import android.widget.TextView;


public class Example022 extends ActionBarActivity {
    private TextView tv_display;
    private NumberPicker np_picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example022);

        tv_display = (TextView) findViewById(R.id.tv_display);
        np_picker = (NumberPicker) findViewById(R.id.np_picker);
        // set a minimum and a maximum value on the number picker
        np_picker.setMinValue(0);
        np_picker.setMaxValue(100);

        // add in a listener to the number picker to listen for changes in numbers
        np_picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            // overridden method that we must provide for when the value changes
            public void onValueChange(NumberPicker picker, int old_val, int new_val) {
                // take the value and apply it to the text view
                tv_display.setText("Current value selected is: " + new_val);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example022, menu);
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
