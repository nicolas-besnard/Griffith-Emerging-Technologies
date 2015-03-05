package com.example.nicolas.androidbyexample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.NumberPicker;
// class definition
public class CustomNumberPicker extends NumberPicker {
    // required constructor that accepts a context
    public CustomNumberPicker(Context c) {
        super(c);
    }
    // required constructor that accepts an attribute set
    public CustomNumberPicker(Context c, AttributeSet as) {
        super(c, as);
    }
    // required constructor that accepts a default style
    public CustomNumberPicker(Context c, AttributeSet as, int default_style) {
        super(c, as, default_style);

        // pick out our attributes for min and max and set their values on the number
        // picker (assumes that values are entered correctly you should do validation
        // here)
        int max = as.getAttributeIntValue(null, "max", 0);
        int min = as.getAttributeIntValue(null, "min", 0);
        setMaxValue(max);
        setMinValue(min);
    }
}