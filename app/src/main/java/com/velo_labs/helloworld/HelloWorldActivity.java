package com.velo_labs.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class HelloWorldActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.velo_labs.helloworld.R.menu.helloworld, menu);
        return true;
    }
}