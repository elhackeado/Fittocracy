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

public class EverydayFeelGoodYoga extends AppCompatActivity {
    String videos[]={"Chair Pose","Child Pose","Cobra Pose","Cow Pose","Forward Fold","Four Limb Pose","Low Lunge Left",
            "Mountain Pose","Prayer Pose","Raised Arm Pose","Tree Pose Left",
            "Warrior Poseii Left","Wide Leg Forward Fold","Wide Leg Stance ArmsUp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everyday_feel_good_yoga);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(EverydayFeelGoodYoga.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Chair Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.chairpose);
                        b.putString("name", "Chair Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Child Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.childpose);
                        b.putString("name", "Child Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Cobra Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.cobrapose);
                        b.putString("name", "Cobra Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Cow Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.cowpose);
                        b.putString("name", "Cow Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Forward Fold": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.forwardfold);
                        b.putString("name", "Forward Fold");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Four Limb Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.fourlimbspose);
                        b.putString("name", "Four Limb Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Low Lunge Left": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.lowlungeleft);
                        b.putString("name", "Low Lunge Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Mountain Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.mountainpose);
                        b.putString("name", "Mountain Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Prayer Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.prayerpose);
                        b.putString("name", "Prayer Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Raised Arm Pose": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.raisedarmspose);
                        b.putString("name", "Raised Arm Pose");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Tree Pose Left": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.treeposeleft);
                        b.putString("name", "Tree Pose Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Warrior Poseii Left": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.warriorposeiileft);
                        b.putString("name", "Warrior Poseii Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wide Leg Forward Fold": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.widelegforwardfold);
                        b.putString("name", "Wide Leg Forward Fold");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wide Leg Stance ArmsUp": {
                        Toast.makeText(EverydayFeelGoodYoga.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.widelegstancearmsup);
                        b.putString("name", "Wide Leg Stance ArmsUp");
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
