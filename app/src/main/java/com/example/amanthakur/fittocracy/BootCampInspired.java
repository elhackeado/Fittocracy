package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BootCampInspired extends AppCompatActivity {
    String videos[] = {"Diamond Push Up","Dive Bomber Push Up","Front Kick","High Jumper","Jumping Jacks","Mountain Climber","Push Up","Sit Up","Squat","Star Jump","Supine Bicycle","Swimmer","Wind Mill"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_camp_inspired);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,videos);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(BootCampInspired.this,MediaPlayer.class);
       final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch(selectedItem){
                    case "Diamond Push Up":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.diamondpushup);
                        b.putString("name","Diamond Push Up");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Dive Bomber Push Up":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.divebomberpushups);
                        b.putString("name","Dive Bomber Push Up");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Front Kick":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.frontkicks);
                        b.putString("name","Front Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "High Jumper":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.highjumper);
                        b.putString("name","High Jumper");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Jumping Jack":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.jumpingjacks);
                        b.putString("name","Jumping Jacks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Climber":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.mountainclimber);
                        b.putString("name","Mountain Climber");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Sit Up":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.situps);
                        b.putString("name","Sit Up");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Squat":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.squats);
                        b.putString("name","Squat");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Star Jump":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.starjumps);
                        b.putString("name","Star Jump");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Supine Bicycle":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.supinebicycle);
                        b.putString("name","Supine Bicycle");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Swimmer":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.swimmer);
                        b.putString("name","Swimmer");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wind Mill":{
                        Toast.makeText(BootCampInspired.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.windmill);
                        b.putString("name","Wind Mill");
                        intent.putExtras(b);
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
