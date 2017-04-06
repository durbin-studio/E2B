package com.aflion.e2bnumberchanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityToTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_test);
        //success check
        Log.e("ActivityToTest","convert 123123:: bd= "+E2B.convertNumber("123123"));
        //chek exception
//        Log.e("ActivityToTest","Exception check convert 123123:: bd= "+E2B.convertNumber("12ld3123"));
    }
}
