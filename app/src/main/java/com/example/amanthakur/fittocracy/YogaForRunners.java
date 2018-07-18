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

public class YogaForRunners extends AppCompatActivity {
    String videos[]={"Butterfly Stretch","Child Pose","Downward Dog","Head to Knee Left",
            "Head to Knee Right","Low Lunge Left","Low Lunge Right",
            "Mountain Pose","Raised Arm Pose","Triangle Left","Triangle Right","Warrior Poseii Left"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_for_runners);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(YogaForRunners.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Butterfly Stretch": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.butterflystretch);
                        b.putString("name", "Butterfly Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Child Pose": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.childpose);
                        b.putString("name", "Child Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Downward Dog": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.downwarddog);
                        b.putString("name", "Downward Dog");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Head to Knee Left": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.headtokneeleft);
                        b.putString("name", "Head to Knee Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Head to Knee Right": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.headtokneeright);
                        b.putString("name", "Head to Knee Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Low Lunge Left": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.lowlungeleft);
                        b.putString("name", "Low Lunge Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Low Lunge Right": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.lowlungeright);
                        b.putString("name", "Low Lunge Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Pose": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.mountainpose);
                        b.putString("name", "Mountain Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Raised Arm Pose": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.raisedarmspose);
                        b.putString("name", "Raised Arm Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Triangle Left": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.triangleleft);
                        b.putString("name", "Triangle Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Triangle Right": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.triangleright);
                        b.putString("name", "Traingle Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Warrior Poseii Left": {
                        Toast.makeText(YogaForRunners.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.warriorposeiileft);
                        b.putString("name", "Warrior Poseii Left");
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
