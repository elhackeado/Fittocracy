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

public class Pilates extends AppCompatActivity {
    String videos[]={"Double Leg Kick","Double Leg Stretch","Leg Pull Back","One Leg Circles",
            "Roll Up","Seated Pine Twist","Spine Strerch Forward","Swan","Swimming","Teaser"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilates);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(Pilates.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Double Leg Kick": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.doublelegkick);
                        b.putString("name", "Double Leg Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Double Leg Stretch": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.doublelegstretch);
                        b.putString("name", "Double Leg Stretch");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Leg Pull Back": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.legpullback);
                        b.putString("name", "Leg Pull Back");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "One Leg Circles": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.onelegcircles);
                        b.putString("name", "One Leg Circles");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Roll Up": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.rollup);
                        b.putString("name", "Roll Up");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Seated Pine Twist": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.seatedspinetwist);
                        b.putString("name", "Seated Pine Twist");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Spine Strerch Forward": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.spinestretchforward);
                        b.putString("name", "Spine Strerch Forward");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Swan": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.swan);
                        b.putString("name", "Swan");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Swimming": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.swimming);
                        b.putString("name", "Swimming");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Teaser": {
                        Toast.makeText(Pilates.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.teaser);
                        b.putString("name", "Teaser");
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
