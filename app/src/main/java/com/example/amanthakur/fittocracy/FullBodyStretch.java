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

public class FullBodyStretch extends AppCompatActivity {
    String videos[]={"Abdominal Stretch","Ankle on Knee","Arm and Shoulder Stretch","Arm Circles",
            "Bend and Reach","Bending Windmill Stretch","Butterfly Stretch","Calf Stretch",
            "Chest Stretch","Hamstring Stretch Standing","Kneeling Hip Flexor","Knee To Chest",
            "Neck Stretch","OverHead Arm Pull","Quadricep Stretch","Seated Hamstring Stretch",
            "Shoulder Shrugs","Side Stretch","Single Leg Hamstring"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_stretch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(FullBodyStretch.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Abdominal Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.abdominalstretch);
                        b.putString("name", "Abdominal Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Ankle on Knee": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.ankleonknee);
                        b.putString("name", "Ankle on Knee");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Arm and Shoulder Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.armandshoulderstretch);
                        b.putString("name", "Arm and Shoulder Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Arm Circles": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.armcircles);
                        b.putString("name", "Arm Circles");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Bend and Reach": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.bendandreach);
                        b.putString("name", "Bend and Reach");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Bending Windmill Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.bendingwindmillstretch);
                        b.putString("name", "Bending Windmill Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Butterfly Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.butterflystretch);
                        b.putString("name", "Butterfly Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Calf Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.calfstretch);
                        b.putString("name", "Calf Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Chest Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.cheststretch);
                        b.putString("name", "Chest Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Hamstring Stretch Standing": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.hamstringstretchstanding);
                        b.putString("name", "Hamstring Stretch Standing");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Kneeling Hip Flexor": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.kneelinghipflexor);
                        b.putString("name", "Kneeling Hip Flexor");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Knee To Chest": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.kneetochest);
                        b.putString("name", "Knee To Chest");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Neck Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.neckstretch);
                        b.putString("name", "Neck Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "OverHead Arm Pull": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.overheadarmpull);
                        b.putString("name", "OverHead Arm Pull");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Quadricep Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.quadricepstretch);
                        b.putString("name", "Quadricep Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Seated Hamstring Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.seatedhamstringstretch);
                        b.putString("name", "Seated Hamstring Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Shoulder Shrugs": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.shouldershrugs);
                        b.putString("name", "Shoulder Shrugs");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Side Stretch": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.sidestretch);
                        b.putString("name", "Side Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Single Leg Hamstring": {
                        Toast.makeText(FullBodyStretch.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.singleleghamstring);
                        b.putString("name", "Single Leg Hamstring");
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
