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

public class LightWarmUpCardio extends AppCompatActivity {

    String videos[]={"Arm Circle","Bend and Reach ","Butt Kicker","Front Kick","High Knee","Pivoting Upper Cut","Running in Place","Side Bend Right","Wind Mill"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_warm_up_cardio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,videos);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(LightWarmUpCardio.this,MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch(selectedItem){
                    case "Arm Circle":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.armcircles);
                        b.putString("name","Arm Circle");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Bend and Reach":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.bendandreach);
                        b.putString("name","Bend and Reach");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Butt Kicker":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.buttkickers);
                        b.putString("name","Butt Kicker");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Front Kick":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.frontkicks);
                        b.putString("name","Front Kick");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "High Knee":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.highknees);
                        b.putString("name","High Knee");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Pivoting Upper Cut":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.pivotinguppercuts);
                        b.putString("name","Pivoting Upper Cut");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Running in Place":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.runninginplace);
                        b.putString("name","Running in Place");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Side Bend Right":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.sidebendright);
                        b.putString("name","Side Bend Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Up Down":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.updowns);
                        b.putString("name","Up Down");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Wind Mill":{
                        Toast.makeText(LightWarmUpCardio.this,selectedItem,Toast.LENGTH_LONG).show();
                        b.putInt("address",R.raw.windmill);
                        b.putString("name","Wind Mill");
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
