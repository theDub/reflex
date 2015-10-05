package com.example.dubsy.reflex;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by dubsydesktop on 9/30/2015.
 */
public class ReactionTimesListTest extends TestCase {
    public ReactionTimesListTest() {
    }

    public void testGetReactionTimes(){
        ReactionTimesList list = new ReactionTimesList();
        ArrayList<ReactionTimer> times = list.getReactionTimes();
        assertTrue("So the list returned an empty array!", times.size() == 0);
    }

    public void testAddReactionTime(){
        ReactionTimesList list = new ReactionTimesList();
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 1000){
            i++;
        }
        r.stop();
        ArrayList<ReactionTimer> x = list.getReactionTimes();
        assertTrue("The size is zero because nobody has added a time.", x.size() == 0);
        list.addReactionTime(r);
        x = list.getReactionTimes();
        assertTrue("Successfully added the reaction time.", x.size() == 1);
    }

    public void testMaxReactionTime(){
        ReactionTimesList list = new ReactionTimesList();
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 10000){
            i++;
        }
        r.stop();
        list.addReactionTime(r);
        ReactionTimer l = new ReactionTimer();
        l.start();
        l.stop();
        list.addReactionTime(l);
        ArrayList<ReactionTimer> x = list.getReactionTimes();
        assertTrue("Reaction size is two long.", x.size() == 2);
        assertTrue("R is bigger since it has to loop 10000 times. ", list.maxReactionTime() == Long.toString(r.getTime()));
    }

    public void testMinReactionTime(){
        ReactionTimesList list = new ReactionTimesList();
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 10000){
            i++;
        }
        r.stop();
        list.addReactionTime(r);
        ReactionTimer l = new ReactionTimer();
        l.start();
        l.stop();
        list.addReactionTime(l);
        ArrayList<ReactionTimer> x = list.getReactionTimes();
        assertTrue("Reaction size is two long.", x.size() == 2);
        assertTrue("R is bigger since it has to loop 10000 times. ", list.minReactionTime() == Long.toString(l.getTime()));
    }

    public void testAvgReactionTime(){
        ReactionTimesList list = new ReactionTimesList();
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 10000){
            i++;
        }
        r.stop();
        list.addReactionTime(r);
        ReactionTimer l = new ReactionTimer();
        l.start();
        l.stop();
        list.addReactionTime(l);
        ArrayList<ReactionTimer> x = list.getReactionTimes();
        assertTrue("Reaction size is two long.", x.size() == 2);
        assertTrue("R is bigger since it has to loop 10000 times. ", list.avgReactionTime() == Long.toString(((l.getTime() + r.getTime())/2)));
    }

    public void testMedReactionTime(){
        ReactionTimesList list = new ReactionTimesList();
        ReactionTimer r = new ReactionTimer();
        r.start();
        int i = 0;
        while(i < 10000){
            i++;
        }
        r.stop();
        list.addReactionTime(r);
        ReactionTimer l = new ReactionTimer();
        l.start();
        l.stop();
        list.addReactionTime(l);
        ArrayList<ReactionTimer> x = list.getReactionTimes();
        assertTrue("Reaction size is two long.", x.size() == 2);
        ReactionTimer t = new ReactionTimer();
        t.start();
        int j = 0;
        while(j < 20000){
            j++;
        }
        t.stop();
        list.addReactionTime(r);
        assertTrue("The Median is now the r time.", list.medReactionTime() == Long.toString(r.getTime()));
    }
}