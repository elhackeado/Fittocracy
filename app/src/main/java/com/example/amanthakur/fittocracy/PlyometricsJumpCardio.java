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

public class PlyometricsJumpCardio extends AppCompatActivity {
    String videos[] = {"Frog Jump", "High Jumper", "Jumping Jack", "Jumping Plank",
            "Knee To Chest", "Mountain Climber", "Power Jump", "Power Skip", "Skater", "Switch Kick", "Up Down"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plyometrics_jump_cardio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(PlyometricsJumpCardio.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Frog Jump": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.frogjumps);
                        b.putString("name", "Frog Jump");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "High Jumper": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.highjumper);
                        b.putString("name", "High Jumper");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Jumping Jack": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.jumpingjacks);
                        b.putString("name", "Jumping Jack");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Jumping Plank": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.jumpingplanks);
                        b.putString("name", "Jumping Plank");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Knee To Chest": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.kneetochest);
                        b.putString("name", "Knee To Chest");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Climber": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.mountainclimber);
                        b.putString("name", "Mountain Climber");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Power Jump": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.powerjump);
                        b.putString("name", "Power Jump");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Power Skip": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.powerskip);
                        b.putString("name", "Power Skip");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Skater": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.skaters);
                        b.putString("name", "Skater");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Switch Kick": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.switchkick);
                        b.putString("name", "Switch Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Up Down": {
                        Toast.makeText(PlyometricsJumpCardio.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.updowns);
                        b.putString("name", "Up Down");
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