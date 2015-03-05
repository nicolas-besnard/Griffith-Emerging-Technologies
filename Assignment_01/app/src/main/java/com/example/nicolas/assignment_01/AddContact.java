package com.example.nicolas.assignment_01;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class AddContact extends ActionBarActivity {

    private SQLiteDatabase DB;

    private EditText nameEditText;
    private EditText phoneEditText;
    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        SQLiteHelper sqliteHelper = new SQLiteHelper(this, "test1.db", null, 1);
        DB = sqliteHelper.getWritableDatabase();

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        phoneEditText = (EditText) findViewById(R.id.phoneEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_contact, menu);
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

    public void clickAddContact(View view) {
        Intent result = new Intent(Intent.ACTION_VIEW);

        String name = String.valueOf(nameEditText.getText());
        String phone = String.valueOf(phoneEditText.getText());
        String email = String.valueOf(emailEditText.getText());
        AlertDialog.Builder alert = new AlertDialog.Builder(this)
                .setTitle("Delete entry")
//                .setMessage("Are you sure you want to delete this entry?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                });

        if (name.length() == 0) {
            alert.setTitle("Empty Name !").show();
        } else if (phone.length() == 0) {
            alert.setTitle("Empty Phone !").show();
        } else if (email.length() == 0) {
            alert.setTitle("Empty Email !").show();
        } else {
            addContact(name, phone, email);
            setResult(RESULT_OK, result);
            finish();
        }
    }

    private void addContact(String name, String phone, String email) {
        ContentValues cv = new ContentValues();
        cv.put("name", name);
        cv.put("phone", phone);
        cv.put("email", email);
        DB.insert("contacts", null, cv);
    }
}
