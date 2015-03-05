package com.example.nicolas.androidbyexample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void goToExample001(View arg0) {
        Intent i = new Intent(this, Example001.class);
        startActivity(i);
    }

    public void goToExample002(View arg0) {
        Intent i = new Intent(this, Example002.class);
        startActivity(i);
    }

    public void goToExample003(View arg0) {
        Intent i = new Intent(this, Example003.class);
        startActivity(i);
    }

    public void goToExample004(View arg0) {
        Intent i = new Intent(this, Example004.class);
        startActivity(i);
    }

    public void goToExample006(View arg0) {
        Intent i = new Intent(this, Example006.class);
        startActivity(i);
    }

    public void goToExample007(View arg0) {
        Intent i = new Intent(this, Example007.class);
        startActivity(i);
    }

    public void goToExample008(View arg0) {
        Intent i = new Intent(this, Example008.class);
        startActivity(i);
    }

    public void goToExample009(View arg0) {
        Intent i = new Intent(this, Example009.class);
        startActivity(i);
    }

    public void goToExample010(View arg0) {
        Intent i = new Intent(this, Example010.class);
        startActivity(i);
    }

    public void goToExample011(View arg0) {
        Intent i = new Intent(this, Example011.class);
        startActivity(i);
    }
    public void goToExample012(View arg0) {
        Intent i = new Intent(this, Example012.class);
        startActivity(i);
    }

    public void goToExample013(View arg0) {
        Intent i = new Intent(this, Example013.class);
        startActivity(i);
    }

    public void goToExample014(View arg0) {
        Intent i = new Intent(this, Example014.class);
        startActivity(i);
    }

    public void goToExample015(View arg0) {
        Intent i = new Intent(this, Example015.class);
        startActivity(i);
    }

    public void goToExample016(View arg0) {
        Intent i = new Intent(this, Example016.class);
        startActivity(i);
    }

    public void goToExample017(View arg0) {
        Intent i = new Intent(this, Example017.class);
        startActivity(i);
    }

    public void goToExample018(View arg0) {
        Intent i = new Intent(this, Example018.class);
        startActivity(i);
    }

    public void goToExample019(View arg0) {
        Intent i = new Intent(this, Example019.class);
        startActivity(i);
    }

    public void goToExample020(View arg0) {
        Intent i = new Intent(this, Example020.class);
        startActivity(i);
    }

    public void goToExample021(View arg0) {
        Intent i = new Intent(this, Example021.class);
        startActivity(i);
    }

    public void goToExample022(View arg0) {
        Intent i = new Intent(this, Example022.class);
        startActivity(i);
    }

    public void goToExample023(View arg0) {
        Intent i = new Intent(this, Example023.class);
        startActivity(i);
    }

    public void goToExample024(View arg0) {
        Intent i = new Intent(this, Example024.class);
        startActivity(i);
    }

    public void goToExample025(View arg0) {
        Intent i = new Intent(this, Example025.class);
        startActivity(i);
    }

    public void goToExample026(View arg0) {
        Intent i = new Intent(this, Example026.class);
        startActivity(i);
    }

    public void goToExample027(View arg0) {
        Intent i = new Intent(this, Example027.class);
        startActivity(i);
    }

    public void goToExample028(View arg0) {
        Intent i = new Intent(this, Example028.class);
        startActivity(i);
    }

    public void goToExample029(View arg0) {
        Intent i = new Intent(this, Example029.class);
        startActivity(i);
    }

    public void goToExample030(View arg0) {
        Intent i = new Intent(this, Example030.class);
        startActivity(i);
    }

    public void goToExample031(View arg0) {
        Intent i = new Intent(this, Example031.class);
        startActivity(i);
    }

    public void goToExample032(View arg0) {
        Intent i = new Intent(this, Example032.class);
        startActivity(i);
    }

    public void goToExample033(View arg0) {
        Intent i = new Intent(this, Example033.class);
        startActivity(i);
    }

    public void goToExample034(View arg0) {
        Intent i = new Intent(this, Example034.class);
        startActivity(i);
    }

    public void goToExample041(View arg0) {
        Intent i = new Intent(this, Example041.class);
        startActivity(i);
    }
}
