package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class Example021 extends ActionBarActivity {
    private TextView tv_display;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example021);

        // pull the TextView and the Spinner from the xml
        tv_display = (TextView) findViewById(R.id.tv_display);
        spinner = (Spinner) findViewById(R.id.spinner);

        // we have to pull the string array from the xml resources and link it up
        // to an array adapter such that it can be used with the spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_strings,
                android.R.layout.simple_spinner_item);
        // specify the layout that will be used on the list of choices when the spinner
        // is clicked
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // set the adapter on the spinner
        spinner.setAdapter(adapter);

        // set a listener on the spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            // overridden method that will be called when an item has been
            // selected in the spinner
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            // here we will query what item was selected and then set
            // its text on the textview
                tv_display.setText("Spinner value selected: " + parent.getItemAtPosition(pos));
            }
            // overridden method that will be called when no item has been
            // selected in the spinner
            public void onNothingSelected(AdapterView<?> parent) {
                // here is where you would react if no item was selected
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example021, menu);
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
