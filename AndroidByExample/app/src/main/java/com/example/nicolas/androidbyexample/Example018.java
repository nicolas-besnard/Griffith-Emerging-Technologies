package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


public class Example018 extends ActionBarActivity {

    private TextView tv_display;
    private EditText et_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example018);

        // pull the textview and the edittext from the xml
        tv_display = (TextView) findViewById(R.id.tv_display);
        et_input = (EditText) findViewById(R.id.et_input);

        // set an editor action listener on the edit text to respond to input
        // events on the return key
        et_input.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView view, int actionid, KeyEvent event)
            {
                Log.i("test", String.valueOf(actionid));
                // if the enter button has been clicked then update the text view with
                // the text that the user has entered.
                if(actionid == EditorInfo.IME_ACTION_DONE){
                    tv_display.setText("Entered: " + et_input.getText());
                    return true;
                }
                // if this event has not been handled then return false
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example018, menu);
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
