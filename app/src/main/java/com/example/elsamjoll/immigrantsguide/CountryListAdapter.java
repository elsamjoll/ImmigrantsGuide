package com.example.elsamjoll.immigrantsguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by elsamjoll on 24/11/15.
 *
 * Adapter sem naer i fanana ur drawables moppunni og nofnin ut fra Locale i android
 */
public class CountryListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public CountryListAdapter(Context context, String[] values) {
        super(context, R.layout.country_list, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.country_list, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.txtViewCountryName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgViewFlag);

        String[] g=values[position].split(",");
        textView.setText(GetCountryZipCode(g[1]).trim());


        String pngName = g[1].trim().toLowerCase();
        imageView.setImageResource(context.getResources().getIdentifier("drawable/" + pngName, null, context.getPackageName()));
        return rowView;
    }

    //Naer i nofnin a londunum utfra zipcode i <item>46,SE</item> i strings.xml...
    //Locale i android ser um thetta
    private String GetCountryZipCode(String ssid){
        Locale loc = new Locale("", ssid);

        return loc.getDisplayCountry().trim();
    }
}