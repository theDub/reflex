/* Copyright (C) 2015  Aaron Arnason

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.*/

package com.example.dubsy.reflex;


import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Timer extends AppCompatActivity {
    public ReactionTimer r;
    private ArrayList<String> times = new ArrayList<String>();
    public ListView listView;
    private boolean myFlag = false;
    public Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        /*handler = new Handler(){
            @Override
            public void handleMessage(Message message){
                times.add(Integer.toString(message.arg1));
            }

        };
        Thread game = new Thread(new daemonThread());
        game.start();
*/
        Button b = (Button) findViewById(R.id.clickerButton);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setResult(RESULT_OK);
                Toast.makeText(Timer.this, "Clicked", Toast.LENGTH_LONG).show();

                myFlag = false;
            }
        });
    }

   /* class daemonThread implements Runnable {

        @Override
        public void run(){
            if(!myFlag){
                try {
                    r.startRandom();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFlag = true;
            } else {
                r.stop();
                Message message = Message.obtain();
                message.arg1 = (int )r.getTime();
                handler.sendMessage(message);

            }
        }
    }*/


    @Override
    protected void onStart(){
        super.onStart();
        r = new ReactionTimer();

        Toast.makeText(this, "Timer has started", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_timer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.email || id == R.id.clearStats) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
