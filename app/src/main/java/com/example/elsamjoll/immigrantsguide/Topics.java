package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by elsamjoll on 24/11/15.
 *
 * Herna thurfum vid ad bua til listvie sem er med Registration,Healthcare.... og gera that
 * clicable...
 */
public class Topics extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topics);


        Intent newActivity1=new Intent();
        setResult(RESULT_OK, newActivity1);
    }

}
