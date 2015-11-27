package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by elsamjoll on 24/11/15.
 *
 * Herna thurfum vid ad bua til listvie sem er med Registration,Healthcare.... og gera that
 * clickable...
 */
public class Topics extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.topics);

        Intent newActivity1 = new Intent();
        setResult(RESULT_OK, newActivity1);

        // storing string resources into Array
        String[] topics_list = getResources().getStringArray(R.array.topics_list);


        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.topics, R.id.listTopicView, topics_list));


        ListView lv = getListView();

        //Bua til onClick listener svo listviewid getur verid clickable
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Registration er nr 0
                if (position == 0) {
                    //Byrd til nytt intent sem naer i Registration klasann
                    Intent myIntent = new Intent(view.getContext(), Registration.class);
                    startActivityForResult(myIntent, 0);
                }
                //Ef thu klikkar a Banking
                if (position == 1) {
                    //Byrd til nytt intent sem naer i Registration klasann
                    Intent myIntent1 = new Intent(view.getContext(), Banking.class);
                    startActivityForResult(myIntent1, 0);
                }
                //Ef thu klikkar a Healthcare
                if (position == 2) {
                    //Byrd til nytt intent sem naer i Healthcare klasann
                    Intent myIntent2 = new Intent(view.getContext(), Healthcare.class);
                    startActivityForResult(myIntent2, 0);
                }

                //Ef thu klikkar a Children
                if (position == 3) {
                    //Byrd til nytt intent sem naer i Children klasann
                    Intent myIntent3 = new Intent(view.getContext(), Children.class);
                    startActivityForResult(myIntent3, 0);
                }
                //Ef thu klikkar a Transportation
                if (position == 4) {
                    //Byrd til nytt intent sem naer i Transportation klasann
                    Intent myIntent4 = new Intent(view.getContext(), Transportation.class);
                    startActivityForResult(myIntent4, 0);
                }
            }
        });
    }



}
