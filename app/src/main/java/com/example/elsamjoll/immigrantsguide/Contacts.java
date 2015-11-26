package com.example.elsamjoll.immigrantsguide;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
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
    }
}
