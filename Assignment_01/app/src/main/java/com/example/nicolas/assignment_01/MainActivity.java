package com.example.nicolas.assignment_01;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private SQLiteHelper sqliteHelper;
    private SQLiteDatabase DB;
    private ArrayList<String> contacts;
    private ArrayAdapter<String> contactsAdapter;
    private ListView contactsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqliteHelper = new SQLiteHelper(this, "test1.db", null, 1);
        DB = sqliteHelper.getReadableDatabase();

        contacts = new ArrayList<>();
        contactsAdapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        contactsListView = (ListView) findViewById(R.id.contactlistView);

        contactsListView.setAdapter(contactsAdapter);

        loadDB();
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

    public void goToAddContactActivity(View view) {
        Intent i = new Intent(this, AddContact.class);
        startActivityForResult(i, 16);
    }

    protected void onActivityResult(int request, int result, Intent data) {
        if(request == 16 && result == RESULT_OK) {
            loadDB();
            Toast.makeText(this, "Contact added.", Toast.LENGTH_LONG).show();
        }
    }

    private void loadDB() {
        String[] columns = {"name", "phone", "email"};
        Cursor c = DB.query("contacts", columns, null, null, null, null, null);

        // print out some data from the cursor to the screen
        c.moveToFirst();
        for(int i = 0; i < c.getCount(); i++) {
            String contact = "Name: "+ c.getString(0) +" Phone: "+ c.getString(1) +" Email: "+ c.getString(2);
            contacts.add(contact);
            c.moveToNext();
        }
        c.close();
        contactsAdapter.notifyDataSetChanged();
    }
}
