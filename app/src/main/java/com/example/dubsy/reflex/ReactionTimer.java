package com.example.dubsy.reflex;

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
    
}
