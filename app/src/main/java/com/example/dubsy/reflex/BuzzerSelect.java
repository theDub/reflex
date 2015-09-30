package com.example.dubsy.reflex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BuzzerSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzer_select);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buzzer_select, menu);
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

    public void twoPlayerMode(View V) {
        Intent intent = new Intent(BuzzerSelect.this, TwoPlayerMode.class);
        startActivity(intent);
    }

    public void threePlayerMode(View v) {
        Intent intent = new Intent(BuzzerSelect.this, ThreePlayerMode.class);
        startActivity(intent);
    }

    public void fourPlayerMode(View v) {
        Intent intent = new Intent(BuzzerSelect.this, FourPlayerMode.class);
        startActivity(intent);
    }
}
