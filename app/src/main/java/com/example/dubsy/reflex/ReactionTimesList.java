package com.example.dubsy.reflex;

import java.util.ArrayList;

/**
 * Created by dubsydesktop on 9/30/2015.
 */
public class ReactionTimesList {
    private ArrayList<ReactionTimer> reactionTimes;
    private long max;
    private long min = Long.MAX_VALUE;
    private long median;
    private long avg;

    public ArrayList<ReactionTimer> getReactionTimes() {
        if (this.reactionTimes == null){
            return new ArrayList<>();
        }
        return this.reactionTimes;
    }

    public void addReactionTime(ReactionTimer r) {
        if (this.reactionTimes == null){
            this.reactionTimes = new ArrayList<>();
            this.reactionTimes.add(r);
        } else {
            this.reactionTimes.add(r);
        }
    }

    public long maxReactionTime() {
        for(ReactionTimer x:this.reactionTimes){
            if (x.getTime() > this.max){
                this.max = x.getTime();
            }
        }
        return this.max;
    }

    public long minReactionTime() {
        for(ReactionTimer x:this.reactionTimes){
            if (x.getTime() < this.min){
                this.min = x.getTime();
            }
        }
        return this.min;
    }

    public long avgReactionTime() {
        long sum = 0;
        for(ReactionTimer x:this.reactionTimes){
            sum += x.getTime();
        }
        return sum/this.reactionTimes.size();
    }

    public long medReactionTime() {
        int [] times = new int[this.reactionTimes.size()];
        int i = 0;
        for(ReactionTimer x:this.reactionTimes){
            times[i] = (int) x.getTime();
            i++;
        }
        Heap_Sort myHeap = new Heap_Sort();
        int[] sortedTimes = myHeap.ascending_sort(times);
        if(sortedTimes.length % 2 == 0 && sortedTimes.length > 2){
            return ((sortedTimes[sortedTimes.length/2] + sortedTimes[sortedTimes.length/2 + 1])/2);
        } else {
            return (sortedTimes[sortedTimes.length/2]);
        }
    }
}