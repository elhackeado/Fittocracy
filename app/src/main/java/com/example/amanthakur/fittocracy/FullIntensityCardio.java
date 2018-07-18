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

public class FullIntensityCardio extends AppCompatActivity {
    String videos[]={"Butt Kicker","Front Kick","Knee To Chest","Mountain Climber","Power Skip","Running In Place","Step Touch","Switch kick","Up Down","Wind Mill"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_intensity_cardio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,videos);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(FullIntensityCardio.this,MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch(selectedItem){
                    case "Butt Kicker":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.buttkickers);
                        b.putString("name","Butt Kicker");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Front Kick":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.frontkicks);
                        b.putString("name","Front Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Knee To Chest":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.kneetochest);
                        b.putString("name","Knee To Chest");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Climber":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.mountainclimber);
                        b.putString("name","Mountain Climber");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Power Skip":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.powerskip);
                        b.putString("name","Power Skip");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Running In Place":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.runninginplace);
                        b.putString("name","Running In Place");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Step Touch":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.steptouch);
                        b.putString("name","Step Touch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Switch Kick":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.switchkick);
                        b.putString("name","Switch Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Up Down":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.updowns);
                        b.putString("name","Up Down");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wind Mill":{
                        Toast.makeText(FullIntensityCardio.this,selectedItem,Toast.LENGTH_LONG).show();
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
