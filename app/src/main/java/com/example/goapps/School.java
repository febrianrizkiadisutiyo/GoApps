package com.example.goapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class School extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listSchool = new String []{"SMA Negeri 1 Pekanbaru", "SMK Negeri 1 Pekanbaru",
                "MAN 1 Pekanbaru", "SMK Taruna Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSchool));
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
            if(pilihan.equals("SMA Negeri 1 Pekanbaru")) {
                a= new Intent(this,Sman1PBR.class);

            }else if(pilihan.equals("SMK Negeri 1 Pekanbaru")){

            }
            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
