package com.example.nicolas.androidbyexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    private int count;
    private TextView tv;
    private Button btn_accept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // get the intent that started this activity and extract the count from
        // it
        Intent intent = getIntent();
        count = intent.getIntExtra("count", 0);

        // grab the textview from the layout and update the text to show the new
        // count value
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("this activity has been started " + count + " times");

        // get the button and attach a listener that will update the counter and
        // will dismiss this activity
        btn_accept = (Button) findViewById(R.id.btn_accept);
        btn_accept.setOnClickListener(new OnClickListener() {
            // overridden on click method to return a result to the starter of this
            // activity
            public void onClick(View v) {
                Intent result = new Intent(Intent.ACTION_VIEW);
                count++;
                result.putExtra("count", count);
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is
        // present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}