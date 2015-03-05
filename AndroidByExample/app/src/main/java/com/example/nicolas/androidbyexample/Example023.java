package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;


public class Example023 extends ActionBarActivity {
    private TextView tv_display;
    private CalendarView cv_calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example023);

        // pull the views from the XML
        tv_display = (TextView) findViewById(R.id.tv_display);
        cv_calender = (CalendarView) findViewById(R.id.cv_calender);

        // set a listener on the calender view to listen for changes in the date
        cv_calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            // overridden method that will be called whenever the user changes the date
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                // display the new date on the text view
                tv_display.setText("Date selected is: " + year + "-" + month + "-" + day);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example023, menu);
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
