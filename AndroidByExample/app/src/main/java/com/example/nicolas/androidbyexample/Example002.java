package com.example.nicolas.androidbyexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Example002 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example002);
        Log.i("MainActivity", "This is an information message");
        Log.w("MainActivity", "This is a warning message");
        Log.e("MainActivity", "This is an error message");
        Log.d("MainActivity", "This is a debug message");
        Log.v("MainActivity", "This is a verbose message which is reserved for really really long text");
        Log.wtf("MainActivity", "This is a WTF/Assertion Failure message. If an assertion fails in your code log it with this");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example002, menu);
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
