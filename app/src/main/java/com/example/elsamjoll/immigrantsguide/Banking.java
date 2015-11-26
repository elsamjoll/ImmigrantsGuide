package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by elsamjoll on 26/11/15.
 */
public class Banking extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banking);

        Intent newActivity1 = new Intent();
        setResult(RESULT_OK, newActivity1);
    }
}
