package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Strength extends AppCompatActivity {
    String item[] = {"Core Strength","Full Body Strength","Lower Body Strength","Upper Body Strength"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);
        getSupportActionBar().setTitle("STRENGTH");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem){
                    case "Core Strength":{
                        Intent intent = new Intent(Strength.this,CoreStrength.class);
                        startActivity(intent);
                        break;
                    }
                    case "Full Body Strength":{
                        Intent intent = new Intent(Strength.this,FullBodyStrength.class);
                        startActivity(intent);
                        break;
                    }
                    case "Lower Body Strength":{
                        Intent intent = new Intent(Strength.this,LowerBodyStrength.class);
                        startActivity(intent);
                        break;
                    }
                    case "Upper Body Strength":{
                        Intent intent = new Intent(Strength.this,UpperBodyStrength.class);
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
