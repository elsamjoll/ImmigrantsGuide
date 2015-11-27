package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by elsamjoll on 26/11/15.
 */
public class Contacts extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.contacts);

        Intent newActivity1 = new Intent();
        setResult(RESULT_OK, newActivity1);

        // storing string resources into Array
        String[] contacts_list = getResources().getStringArray(R.array.contacts_list);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.contacts, R.id.listContactsView, contacts_list));

        ListView listviewContacts = getListView();


        //Bua til onClick listener svo listviewid getur verid clickable
        listviewContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Registration er nr 0
                if (position == 0) {
                    //Byrd til nytt intent sem naer i Registration klasann
                    Intent myIntent = new Intent(view.getContext(), Pedro.class);
                    startActivityForResult(myIntent, 0);
                }
                //Ef thu klikkar a Banking
                if (position == 1) {
                    //Byrd til nytt intent sem naer i Registration klasann
                    Intent myIntent1 = new Intent(view.getContext(), Helena.class);
                    startActivityForResult(myIntent1, 0);
                }
                //Ef thu klikkar a Healthcare
                if (position == 2) {
                    //Byrd til nytt intent sem naer i Healthcare klasann
                    Intent myIntent2 = new Intent(view.getContext(), Sigga.class);
                    startActivityForResult(myIntent2, 0);
                }

                //Ef thu klikkar a Children
                if (position == 3) {
                    //Byrd til nytt intent sem naer i Children klasann
                    Intent myIntent3 = new Intent(view.getContext(), Jon.class);
                    startActivityForResult(myIntent3, 0);
                }

            }
        });
    }


    }

