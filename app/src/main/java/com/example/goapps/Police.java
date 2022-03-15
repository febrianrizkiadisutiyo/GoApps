package com.example.goapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Police extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String []{"Polsek Pekanbaru Kota", "Polresta Pekanbaru",
                "Polda Riau", "Ditlantas Polda Riau"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }

    protected  void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v,position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if(pilihan.equals("Polsek Pekanbaru Kota")) {
                a= new Intent(this,RSAwalBross.class);

            }else if(pilihan.equals("Polresta Pekanbaru")){

            }
            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}