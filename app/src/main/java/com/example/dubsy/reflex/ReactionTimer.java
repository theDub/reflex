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


import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * Created by dubsydesktop on 9/30/2015.
 */
public class ReactionTimer {
    private long startTime;
    private long stopTime;

    public ReactionTimer() {
    }

    public long getTime() {
        return this.stopTime - this.startTime;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.stopTime = System.nanoTime();
    }

    public void startRandom() throws InterruptedException {
        double randomVal = (Math.random() * 2000);
        if(randomVal < 10.0){
            randomVal = 10;
        }
        long x = Math.round(randomVal);

        TimeUnit.MILLISECONDS.sleep(x);

        this.start();
    }
}
