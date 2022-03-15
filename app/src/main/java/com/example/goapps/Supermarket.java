package com.example.goapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Supermarket extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listSupermarket = new String []{"Supermarkets Planet Marpoyan", "Hawali Supermarket",
                "Giant Ekstra Tuanku Tambusai", "Metro Plaza"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSupermarket));
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
            if(pilihan.equals("Supermarkets Planet Marpoyan")) {
                a= new Intent(this,SplanetMarpoyan.class);

            }else if(pilihan.equals("Hawali Supermarket")){

            }
            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
