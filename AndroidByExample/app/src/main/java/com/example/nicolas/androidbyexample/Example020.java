package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class Example020 extends ActionBarActivity {
    private TextView tv_display;
    private RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example020);

        // get the widgets from the XML
        tv_display = (TextView) findViewById(R.id.tv_display);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);

        // attach a listener to the first radio button
        rb1.setOnClickListener(new View.OnClickListener() {
            // method that must be implemented in an onClick listener
            public void onClick(View arg0) {
             // change the text to state that radio button one was clicked
                tv_display.setText(R.string.tv_display_rb1);
            }
        });

        // attach a listener to the second radio button
        rb2.setOnClickListener(new View.OnClickListener() {
            // method that must be implemented in an onClick listener
            public void onClick(View arg0) {
                // change the text to state that radio button one was clicked
                tv_display.setText(R.string.tv_display_rb2);
            }
        });

        // attach a listener to the third radio button
        rb3.setOnClickListener(new View.OnClickListener() {
            // method that must be implemented in an onClick listener
            public void onClick(View arg0) {
            // change the text to state that radio button one was clicked
                tv_display.setText(R.string.tv_display_rb3);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example020, menu);
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
