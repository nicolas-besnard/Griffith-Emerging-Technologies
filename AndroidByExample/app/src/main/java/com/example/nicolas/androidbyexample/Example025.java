package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Example025 extends ActionBarActivity {
    // private fields of the class
    private TextView tv_display;
    private ListView lv_mainlist;
    private EditText et_new_strings;
    private ArrayList<CustomItem> al_items;
    private CustomArrayAdapter caa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example025);

        // pull the list view and the edit text from the xml
        tv_display = (TextView) findViewById(R.id.tv_display);
        lv_mainlist = (ListView) findViewById(R.id.lv_mainlist);
        et_new_strings = (EditText) findViewById(R.id.et_new_strings);

        // generate an array list with some simple strings
        al_items = new ArrayList<CustomItem>();

        // create an array adapter for al_strings and set it on the listview
        caa = new CustomArrayAdapter(this, al_items);
        lv_mainlist.setAdapter(caa);

        // add in a listener for the edit text to create new items in our list view
        et_new_strings.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView view, int actionid, KeyEvent event)
            {
                // if the user is done entering in a new string then add it to
                // the array list. this then notifies the adapter that the data has
                // changed and that the list view needs to be updated
                if(actionid == EditorInfo.IME_ACTION_DONE) {
                    al_items.add(new
                            CustomItem(et_new_strings.getText().toString(), System.currentTimeMillis()));
                    caa.notifyDataSetChanged();
                    tv_display.setText("added item: " + et_new_strings.getText());
                    return true;
                }
                // if we get to this point then the event has not been handled thus
                // return false
                return false;
            }
        });

        // add in a listener that listens for short clicks on our list items
        lv_mainlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // overridden method that we must implement to get access to short clicks
            public void onItemClick(AdapterView<?> adapterview, View view, int pos, long id) {
                // update the text view to state that a short click was made here
                tv_display.setText("item " + pos + " selected");
            }
        });

        // add in a listener that listens for long clicks on our list items
        lv_mainlist.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            // overridden method that we must implement to get access to long clicks
            public boolean onItemLongClick(AdapterView<?> adapterview, View view, int pos, long id) {
                // update the display with what we have just long clicked
                tv_display.setText("item " + pos + " long clicked");

                // as we are going to change the textview anyway we can automatically
                // return true;
                return true;
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example025, menu);
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
