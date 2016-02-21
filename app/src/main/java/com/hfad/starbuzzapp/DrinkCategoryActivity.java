package com.hfad.starbuzzapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Vector;


public class DrinkCategoryActivity extends ListActivity
  {
    private String[] drinks;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        drinks=getResources().getStringArray(R.array.drinks);
        ArrayAdapter<String> listAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,drinks);
        ListView listView=getListView();
        listView.setAdapter(listAdapter);

    }
       @Override
       public void onListItemClick(ListView listView,View itemView,int position,long id)
       {
           Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
           intent.putExtra(DrinkActivity.EXTRA_DRINKNO,(int)id);
           startActivity(intent);
       }

}
