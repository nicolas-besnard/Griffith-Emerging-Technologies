package com.example.nicolas.androidbyexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

// class definition
public class CustomEditText extends LinearLayout {
    // required constructor that takes in a context
    public CustomEditText(Context c) {
        super(c);
        init();
    }
    // required constructor that takes in an attribute set
    public CustomEditText(Context c, AttributeSet as) {
        super(c, as);
        init();
    }
    // required constructor that takes in a style
    public CustomEditText(Context c, AttributeSet as, int default_style) {
        super(c, as, default_style);
        init();
    }
    // private method that will share initialisation between all three
    // constructors
    private void init() {
        LayoutInflater li = (LayoutInflater)
        getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        li.inflate(R.layout.compound_view_layout, this, true);

        // get access to the controls and add a listener
        et_edit = (EditText) findViewById(R.id.et_entry);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new OnClickListener() {
            // overridden method that will clear the text in the edit text
            // when the button is clicked
            public void onClick(View v) {
                et_edit.setText("");
            }
        });
    }
    // private fields of the class
    private EditText et_edit;
    private Button btn_clear;
}