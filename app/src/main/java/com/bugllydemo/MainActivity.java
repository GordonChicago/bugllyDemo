package com.bugllydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nullPointer(View view) {
        String s = null;
        Toast.makeText(this, s.length() + "", Toast.LENGTH_SHORT);
    }

    public void anrTest(View view) throws Exception {
        Thread.sleep(6000);
    }
}
