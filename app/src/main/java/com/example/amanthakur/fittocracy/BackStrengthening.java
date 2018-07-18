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

public class BackStrengthening extends AppCompatActivity {
    String videos[]={"Genie Sit","Hip Raise","Kneeling hip Flexor","Lay on Back",
                    "Plank","QuadraPlex","Side Bend Left","Side Bend Right","Side Stretch" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_strengthening);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, videos);
        listView.setAdapter(arrayAdapter);
        final Intent intent = new Intent(BackStrengthening.this, MediaPlayer.class);
        final Bundle b = new Bundle();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String address = ("android.resource://" + getPackageName() + "/");

                String selectedItem = listView.getItemAtPosition(i).toString().trim();
                switch (selectedItem) {
                    case "Genie Sit": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.geniesit);
                        b.putString("name", "Genie Sit");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Hip Raise": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.hipraise);
                        b.putString("name", "Hip Raise");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Kneeling hip Flexor": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.kneelinghipflexor);
                        b.putString("name", "Kneeling hip Flexor");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Lay on Back": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.layonback);
                        b.putString("name", "Lay on Back");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Plank": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.plank);
                        b.putString("name", "Plank");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "QuadraPlex": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.quadraplex);
                        b.putString("name", "QuadraPlex");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }

                    case "Side Bend Left": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.sidebendleft);
                        b.putString("name", "Side Bend Left");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Side Bend Right": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.sidebendright);
                        b.putString("name", "Side Bend Right");
                        intent.putExtras(b);
                        startActivity(intent);
                        break;

                    }
                    case "Side Stretch": {
                        Toast.makeText(BackStrengthening.this, selectedItem, Toast.LENGTH_LONG).show();
                        b.putInt("address", R.raw.sidestretch);
                        b.putString("name", "Side Stretch");
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
