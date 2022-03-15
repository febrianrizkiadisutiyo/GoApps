package com.example.goapps;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class Police extends ListActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String [] listPolice = new String[]{"Febrian Rizki", "Ismawan Putra",
                "Alif Alfarabi B","Rasyid Sidiq","M Rizki Davito"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPolice));


    }
}
