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

public class UpperBodyStrength extends AppCompatActivity {
    String videos[]={"Alternating PushUp Plank","Chest Expander","DiveBomber PushUp","Jumping Jacks","OverHead Arm Clap",
            "OverHead Press","Power Circle", "PushUp","Reverse Plank","Shoulder Tap PushUp","T Raise","Wall PushUps","Wide Arm PushUp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body_strength);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(UpperBodyStrength.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Alternating PushUp Plank": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.alternatingpushupplank);
                        b.putString("name", "Alternating PushUp Plank");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Chest Expander": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.chestexpander);
                        b.putString("name", "Chest Expander");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "DiveBomber PushUp": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.divebomberpushups);
                        b.putString("name", "DiveBomber PushUp");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Jumping Jacks": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.jumpingjacks);
                        b.putString("name", "Jumping Jacks");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "OverHead Arm Clap": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.overheadarmclap);
                        b.putString("name", "OverHead Arm Clap");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "OverHead Press": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.overheadpress);
                        b.putString("name", "OverHead Press");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Power Circle": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.powercircles);
                        b.putString("name", "Power Circle");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "PushUp": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.pushup);
                        b.putString("name", "PushUp");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Reverse Plank": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.reverseplank);
                        b.putString("name", "Reverse Plank");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Shoulder Tap PushUp": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.shouldertappushup);
                        b.putString("name", "Shoulder Tap PushUp");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "T Raise": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.traise);
                        b.putString("name", "T Raise");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wall PushUps": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.wallpushups);
                        b.putString("name", "Wall PushUps");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wide Arm PushUp": {
                        Toast.makeText(UpperBodyStrength.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.widearmpushup);
                        b.putString("name", "Wide Arm PushUp");
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
