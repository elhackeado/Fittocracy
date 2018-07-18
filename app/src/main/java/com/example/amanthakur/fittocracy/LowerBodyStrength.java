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

public class LowerBodyStrength extends AppCompatActivity {
    String videos[]={"Butt Kickers","Frog Jumps","Front Kicks","Genie Sit","High Jumper","Mountain Climber","Squats","Wall Sits"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body_strength);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(LowerBodyStrength.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Butt Kickers": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.buttkickers);
                        b.putString("name", "Butt Kickers");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Frog Jumps": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.frogjumps);
                        b.putString("name", "Frog Jumps");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Front Kicks": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.frontkicks);
                        b.putString("name", "Front Kicks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Genie Sit": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.geniesit);
                        b.putString("name", "Genie Sit");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "High Jumper": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.highjumper);
                        b.putString("name", "High Jumper");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Climber": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.mountainclimber);
                        b.putString("name", "Mountain Climber");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Squats": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.squats);
                        b.putString("name", "Squats");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wall Sits": {
                        Toast.makeText(LowerBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.wallsits);
                        b.putString("name", "Wall Sits");
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
