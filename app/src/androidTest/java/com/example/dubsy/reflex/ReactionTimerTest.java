package com.example.dubsy.reflex;

import junit.framework.TestCase;

/**
 * Created by dubsydesktop on 9/30/2015.
 */
public class ReactionTimerTest extends TestCase {
    public ReactionTimerTest() {
    }

    public void testTimer() {
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 1000){
            i++;
        }
        r.stop();
        assertTrue("Yay, getTime is returning some non-zero value.", r.getTime() != 0);
    }
}