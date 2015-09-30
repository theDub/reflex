package com.example.dubsy.reflex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.email && id == R.id.clearStats) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void timerAction(View V) {
        Intent intent = new Intent(MainMenu.this, Timer.class);
        startActivity(intent);
    }

    public void statisticsAction(View v) {
        Intent intent;
        intent = new Intent(MainMenu.this, Statistics.class);
        startActivity(intent);
    }

    public void buzzerAction(View v) {
        Intent intent = new Intent(MainMenu.this, BuzzerSelect.class);
        startActivity(intent);
    }
}
