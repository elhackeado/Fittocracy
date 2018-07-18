package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cardio extends AppCompatActivity {
    String item[] = {"Boot Camp Inspired","Full Intensity Cardio","Light Warm Up Cardio","Plyometrics Jump Cardio"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
        getSupportActionBar().setTitle("CARDIO");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem){
                    case "Boot Camp Inspired":{
                        Intent intent = new Intent(Cardio.this,BootCampInspired.class);
                        startActivity(intent);
                        break;
                    }
                    case "Full Intensity Cardio":{
                        Intent intent = new Intent(Cardio.this,FullIntensityCardio.class);
                        startActivity(intent);
                        break;
                    }
                    case "Light Warm Up Cardio":{
                        Intent intent = new Intent(Cardio.this,LightWarmUpCardio.class);
                        startActivity(intent);
                        break;
                    }
                    case "Plyometrics Jump Cardio":{
                        Intent intent = new Intent(Cardio.this,PlyometricsJumpCardio.class);
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
