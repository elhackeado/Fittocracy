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

public class StandingOnlyStretch extends AppCompatActivity {
    String videos[]={"Abdominal Stretch","Arm and Shoulder Stretch","Arm Circles"," Calf Stretch",
                        "Chest Stretch","Hamstring Stretch Standing","Neck Stretch","OverHead Arm Pull",
                        "Quadricep Stretch","Shoulder Shrugs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standing_only_stretch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(StandingOnlyStretch.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Abdominal Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.abdominalstretch);
                        b.putString("name", "Abdominal Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Arm and Shoulder Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.armandshoulderstretch);
                        b.putString("name", "Arm and Shoulder Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Arm Circles": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.armcircles);
                        b.putString("name", "Arm Circles");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Calf Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.calfstretch);
                        b.putString("name", "Calf Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Chest Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.cheststretch);
                        b.putString("name", "Chest Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Hamstring Stretch Standing": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.hamstringstretchstanding);
                        b.putString("name", "Hamstring Stretch Standing");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Neck Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.neckstretch);
                        b.putString("name", "Neck Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "OverHead Arm Pull": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.overheadarmpull);
                        b.putString("name", "OverHead Arm Pull");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Quadricep Stretch": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.quadricepstretch);
                        b.putString("name", "Quadricep Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Shoulder Shrugs": {
                        Toast.makeText(StandingOnlyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.shouldershrugs);
                        b.putString("name", "Shoulder Shrugs");
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
