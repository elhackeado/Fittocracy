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

public class CoreStrength extends AppCompatActivity {
    String videos[]={"Burpees","Elevated Crunches","In And Out Abs","Mason Twist","Plank","Plank Pose","Quadra Plex",
            "Scissor Kicks","Sit Ups","Steam Engine","Supine Bicycle","Swimmer","Twisting Crunches","V-SitUps","Windmill"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_strength);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(CoreStrength.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Burpees": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.burpees);
                        b.putString("name", "Burpees");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Elevated Crunches": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.elevatedcrunches);
                        b.putString("name", "Elevated Crunches");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "In And Out Abs": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.inandoutabs);
                        b.putString("name", "In And Out Abs");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mason Twist": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.masontwist);
                        b.putString("name", "Mason Twist");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Plank": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.plank);
                        b.putString("name", "Plank");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Plank Pose": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.plankpose);
                        b.putString("name", "Plank Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Quadra Plex": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.quadraplex);
                        b.putString("name", "Quadra Plex");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Scissor Kicks": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.scissorkicks);
                        b.putString("name", "Scissor Kicks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Sit Ups": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.situps);
                        b.putString("name", "Sit Ups");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Steam Engine": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.steamengine);
                        b.putString("name", "Steam Engine");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Supine Bicycle": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.supinebicycle);
                        b.putString("name", "Supine Bicycle");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Swimmer": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.swimmer);
                        b.putString("name", "Swimmer");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Twisting Crunches": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.twistingcrunches);
                        b.putString("name", "Twisting Crunches");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "V-SitUps": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.vsitups);
                        b.putString("name", "V-SitUps");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Windmill": {
                        Toast.makeText(CoreStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.windmill);
                        b.putString("name", "Windmill");
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
