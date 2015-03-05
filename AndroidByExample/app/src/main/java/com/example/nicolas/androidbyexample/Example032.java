package com.example.nicolas.androidbyexample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Example032 extends ActionBarActivity {

    private Button btn;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example032);

        // initialise the count to zero
        count = 0;
        // add a listener to the button that will launch the second activity and
        // will attach the count to the intent
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            // overridden method to handle the button click
            public void onClick(View v) {
                Intent intent = new Intent(Example032.this, ThirdActivity.class);
                intent.putExtra("count", count);
                startActivityForResult(intent, 16);
            }
        });
    }

    protected void onActivityResult(int request, int result, Intent data) {
        // check the request code for the intent and if the result was ok. if both
        // are good then take a copy of the updated count variable
        if(request == 16 && result == RESULT_OK) {
            count = data.getIntExtra("count", 0);
            Log.i("MainActivity", "count is " + count);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example032, menu);
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
