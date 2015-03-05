package com.example.nicolas.androidbyexample;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Example041 extends ActionBarActivity {
    private TestDBOpenHelper tdb;
    private SQLiteDatabase sdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example041);

        tdb = new TestDBOpenHelper(this, "test.db", null, 1);
        sdb = tdb.getWritableDatabase();

        // add in a few rows to our database
        ContentValues cv = new ContentValues();
        cv.put("FIRST_NAME", "john");
        cv.put("LAST_NAME", "doe");
        cv.put("COURSE", "computing");
        sdb.insert("test", null, cv);
        cv.put("FIRST_NAME", "jane");
        cv.put("LAST_NAME", "doe");
        sdb.insert("test", null, cv);
        cv.put("FIRST_NAME", "jim");
        cv.put("LAST_NAME", "doe");
        sdb.insert("test", null, cv);

        ContentValues u = new ContentValues();
        u.put("FIRST_NAME", "jacob");
        sdb.update("test", u, "FIRST_NAME = 'jim' ", null);

        // name of the table to query
        String table_name = "test";

        // the columns that we wish to retrieve from the tables
        String[] columns = {"ID", "FIRST_NAME"};

        // where clause of the query. DO NOT WRITE WHERE IN THIS
        String where = null;

        // arguments to provide to the where clause
        String where_args[] = null;

        // group by clause of the query. DO NOT WRITE GROUP BY IN THIS
        String group_by = null;

        // having clause of the query. DO NOT WRITE HAVING IN THIS
        String having = null;

        // order by clause of the query. DO NOT WRITE ORDER BY IN THIS
        String order_by = null;

        // run the query. this will give us a cursor into the database
        // that will enable us to change the table row that we are working with
        Cursor c = sdb.query(table_name, columns, where, where_args, group_by, having, order_by);

        // print out some data from the cursor to the screen
        TextView tv = (TextView) findViewById(R.id.tv);
        String total_text = "total number of rows: " + c.getCount() + "\n";
        c.moveToFirst();
        for(int i = 0; i < c.getCount(); i++) {
            total_text += c.getInt(0) + " " + c.getString(1) + "\n";
            c.moveToNext();
        }
        tv.setText(total_text);
    }

    // overridden method that will clear out the contents of the database
    protected void onDestroy() {
        super.onDestroy();
        // run a query that will delete all the rows in our database
        String table = "test";
        String where = null;
        String where_args[] = null;
        sdb.delete(table, where, where_args);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example041, menu);
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
