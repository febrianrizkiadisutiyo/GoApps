package com.example.goapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SplanetMarpoyan extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String []{"Call Center", "SMS Center","Driving Direction",
                "Website", "Info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if(pilihan.equals("Call Center")) {
                String nomorTel ="tel:0761-73646347";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));

            }else if(pilihan.equals("SMS Center")){
                String smstext="Febrian Rizki H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082268665453"));
                a.putExtra("sms_body",smstext);
            }else if(pilihan.equals("Driving Direction")){
                String lokasirs = "google.navigation:q=0.463823,1001.390353";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            } else if(pilihan.equals("Website")){
                String website="https://vymaps.com/ID/Planet-Swalayan-2471154/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            } else if (pilihan.equals("Info di Google")){
                a= new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Supermarkets Planet Marpoyan");
            }

            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
