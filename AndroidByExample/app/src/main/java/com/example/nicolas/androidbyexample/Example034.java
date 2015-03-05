package com.example.nicolas.androidbyexample;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;


public class Example034 extends ActionBarActivity {
    private Button btn_get_pic;
    private ImageView iv_view;
    private Uri uri_new_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example034);

        // pull the button from the layout and attach a listener that will launch
        // an intent for the camera when it is clicked
        btn_get_pic = (Button) findViewById(R.id.btn_get_pic);
        iv_view = (ImageView) findViewById(R.id.iv_view);
        btn_get_pic.setOnClickListener(new View.OnClickListener() {
            // overridden method that will launch an intent for the camera
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File file_new = new File(Example034.this.getExternalFilesDir(null), "test.jpg");
                uri_new_image = Uri.fromFile(file_new);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, uri_new_image);
                startActivityForResult(intent, 100);
            }
        });
    }

    public void onActivityResult(int request_code, int result_code, Intent data) {
        // if we get an ok result from the camera we should display the image in
        // the image view
        if(request_code == 100 && result_code == RESULT_OK) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap image = BitmapFactory.decodeFile(uri_new_image.getPath(),
                    options);
            if(image == null) {
                Log.d("MainActivity::onActivityResult", "failed to load image");
                return;
            }
            iv_view.setImageBitmap(image);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_example034, menu);
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
