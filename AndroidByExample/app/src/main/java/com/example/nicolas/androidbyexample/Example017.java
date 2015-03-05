package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Example017 extends ActionBarActivity {
    private int clicks;
    private int clicks2;
    private TextView tv_display;
    private TextView tv_display2;
    private Button btn_clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example017);

        clicks = 0;
        clicks2 = 0;
        tv_display = (TextView) findViewById(R.id.tv_display);


        btn_clickme = (Button) findViewById(R.id.btn_clickme);
        tv_display2 = (TextView) findViewById(R.id.tv_display2);
        // add a click listener to the button
        btn_clickme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                clicks2++;
                tv_display2.setText("Button has been clicked " + clicks2 + " times");
            }
        });
    }

    public void buttonPress(View arg0) {
        clicks++;
        tv_display.setText("Button has been clicked " + clicks + " times");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example017, menu);
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
