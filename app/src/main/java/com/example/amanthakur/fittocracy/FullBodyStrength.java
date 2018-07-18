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

public class FullBodyStrength extends AppCompatActivity {
    String videos[]={"Butt Kicker","Diamond Push-Ups","Frog Jumps","Front Kicks","High Jumper",
            "Jumping Jacks","Jump Squats","OverHead Arm Clap","Power Circles","PushUp",
            "Running in Place","Scissor Kicks","Squats","Steam Engine","Tricep Dips",
            "Twisting Crunches","Wall Push-Ups","Wide Arm PushUp","Windmill"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_strength);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(FullBodyStrength.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Butt Kicker": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.buttkickers);
                        b.putString("name", "Butt Kicker");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Diamond Push-Ups": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.diamondpushup);
                        b.putString("name", "Diamond Push-Ups");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Frog Jumps": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.frogjumps);
                        b.putString("name", "Frog Jumps");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Front Kicks": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.frontkicks);
                        b.putString("name", "Front Kicks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "High Jumper": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.highjumper);
                        b.putString("name", "High Jumper");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Jumping Jacks": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.jumpingjacks);
                        b.putString("name", "Jumping Jacks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Jump Squats": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.jumpsquats);
                        b.putString("name", "Jump Squats");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "OverHead Arm Clap": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.overheadarmclap);
                        b.putString("name", "OverHead Arm Clap");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Power Circles": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.powercircles);
                        b.putString("name", "Power Circles");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "PushUp": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.pushup);
                        b.putString("name", "PushUp");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Running in Place": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.runninginplace);
                        b.putString("name", "Running in Place");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Scissor Kicks": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.scissorkicks);
                        b.putString("name", "Scissor Kicks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Squats": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.squats);
                        b.putString("name", "Squats");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Steam Engine": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.steamengine);
                        b.putString("name", "Steam Engine");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Tricep Dips": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.tricepdips);
                        b.putString("name", "Tricep Dips");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Twisting Crunches": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.twistingcrunches);
                        b.putString("name", "Twisting Crunches");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wall Push-Ups": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.wallpushups);
                        b.putString("name", "Wall Push-Ups");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wide Arm PushUp": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.widearmpushup);
                        b.putString("name", "Wide Arm PushUp");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Windmill": {
                        Toast.makeText(FullBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
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
