package com.example.elsamjoll.immigrantsguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setja londin i array ut fra strings.xml hlutunum
        String[] recourseList = this.getResources().getStringArray(R.array.CountryCodes);

        //Setja londin og fanana i listview (sem er í activity_main.xml
        final ListView listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(new CountryListAdapter(this, recourseList));

        //Bua til onClick listener svo listviewid getur verid clickable
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // Getur bara valid Island sem er nr 3 a listanum
                if (position == 2) {
                    //Byrd til nytt intent sem naer i Topics klasann
                    Intent myIntent = new Intent(view.getContext(), Topics.class);
                    startActivityForResult(myIntent, 0);
                }
                //Ef thu klikkar a annad land en Island
                else{
                    Toast.makeText(getApplicationContext(), "You have to choose Iceland as a country",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
