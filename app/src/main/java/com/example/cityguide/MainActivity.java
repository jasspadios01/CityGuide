package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction={"Iloilo City", "Manila", "Davao City", "Cebu City"};
        setListAdapter(new ArrayAdapter(this, R.layout.activity_main, R.id.travel, attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, IloiloCity.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://manila.gov.ph/")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, DavaoCity.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.cebucity.gov.ph/")));
                break;
        }
    }
}