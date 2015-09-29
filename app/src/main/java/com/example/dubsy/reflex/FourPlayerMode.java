package com.example.dubsy.reflex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class FourPlayerMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_player_mode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_player_mode, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void playerOneClickM4(View v) {
        Toast.makeText(this, "4 Player Mode Winning Click Player 1", Toast.LENGTH_SHORT).show();
    }

    public void playerTwoClickM4(View v) {
        Toast.makeText(this, "4 Player Mode Winning Click Player 2", Toast.LENGTH_SHORT).show();
    }

    public void playerThreeClickM4(View v) {
        Toast.makeText(this, "4 Player Mode Winning Click Player 3", Toast.LENGTH_SHORT).show();
    }

    public void playerFourClickM4(View v) {
        Toast.makeText(this, "4 Player Mode Winning Click Player 4", Toast.LENGTH_SHORT).show();
    }
}
