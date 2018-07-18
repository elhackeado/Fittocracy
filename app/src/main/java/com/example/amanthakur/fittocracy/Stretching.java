package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Stretching extends AppCompatActivity {
    String item[] = {"Back Strengthening","Full Body Stretch","Head To Toe Warmup Stretch","Standing Only Stretch"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);
        getSupportActionBar().setTitle("STRETCHING");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem){
                    case "Back Strengthening":{
                        Intent intent = new Intent(Stretching.this,BackStrengthening.class);
                        startActivity(intent);
                        break;
                    }
                    case "Full Body Stretch":{
                        Intent intent = new Intent(Stretching.this,FullBodyStretch.class);
                        startActivity(intent);
                        break;
                    }
                    case "Head To Toe Warmup Stretch":{
                        Intent intent = new Intent(Stretching.this,HeadToToeWarmupStretch.class);
                        startActivity(intent);
                        break;
                    }
                    case "Standing Only Stretch":{
                        Intent intent = new Intent(Stretching.this,StandingOnlyStretch.class);
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
