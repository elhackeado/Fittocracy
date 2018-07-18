package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Yoga extends AppCompatActivity {
    String item[] = {"Everyday Feel Good Yoga","Pilates","Yoga For Runners","Yoga Sun Salutation"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        getSupportActionBar().setTitle("YOGA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem){
                    case "Everyday Feel Good Yoga":{
                        Intent intent = new Intent(Yoga.this,EverydayFeelGoodYoga.class);
                        startActivity(intent);
                        break;
                    }
                    case "Pilates":{
                        Intent intent = new Intent(Yoga.this,Pilates.class);
                        startActivity(intent);
                        break;
                    }
                    case "Yoga For Runners":{
                        Intent intent = new Intent(Yoga.this,YogaForRunners.class);
                        startActivity(intent);
                        break;
                    }
                    case "Yoga Sun Salutation":{
                        Intent intent = new Intent(Yoga.this,YogaForSalutation.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return true;
    }
}
