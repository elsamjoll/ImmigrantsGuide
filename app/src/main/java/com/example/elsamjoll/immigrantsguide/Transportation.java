package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by elsamjoll on 26/11/15.
 */
public class Transportation extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportation);

        Intent newActivity1 = new Intent();
        setResult(RESULT_OK, newActivity1);

        Button button= (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Contacts.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
