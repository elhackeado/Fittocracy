package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton bt1,bt2,bt3,bt4;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bt1 = (ImageButton) findViewById(R.id.one);
        bt2=(ImageButton)findViewById(R.id.two);
        bt3=(ImageButton)findViewById(R.id.three);
        bt4=(ImageButton)findViewById(R.id.four);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Cardio.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Strength.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Yoga.class);
                startActivity(i);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Stretching.class);
                startActivity(i);
            }
        });
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mActionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Intent intent;
        switch (menuItem.getItemId()){
            case R.id.item1: {
                intent = new Intent(MainActivity.this,Cardio.class);
                startActivity(intent);
                break;
            }
            case R.id.item2: {
                intent = new Intent(MainActivity.this,Strength.class);
                startActivity(intent);
                break;
            }
            case R.id.item3: {
                intent = new Intent(MainActivity.this,Stretching.class);
                startActivity(intent);
                break;
            }
            case R.id.item4: {
                intent = new Intent(MainActivity.this,Yoga.class);
                startActivity(intent);
                break;
            }
            case R.id.item5: {
                intent = new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent);
                break;
            }
        }
        return true;
    }
}
