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

public class YogaForSalutation extends AppCompatActivity {
    String videos[]={"Cobra Pose","Downward Dog","Four Limbs Pose","Low Lunge Left","Low Lunge Right",
            "Plank Pose","Prayer Pose","Raised Arm Pose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_for_salutation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(YogaForSalutation.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Cobra Pose": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.cobrapose);
                        b.putString("name", "Cobra Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Downward Dog": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.downwarddog);
                        b.putString("name", "Downward Dog");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Four Limbs Pose": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.fourlimbspose);
                        b.putString("name", "Four Limbs Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Low Lunge Left": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.lowlungeleft);
                        b.putString("name", "Low Lunge Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Low Lunge Right": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.lowlungeright);
                        b.putString("name", "Low Lunge Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Plank Pose": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.plankpose);
                        b.putString("name", "Plank Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Prayer Pose": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.prayerpose);
                        b.putString("name", "Prayer Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Raised Arm Pose": {
                        Toast.makeText(YogaForSalutation.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.raisedarmspose);
                        b.putString("name", "Raised Arm Pose");
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
