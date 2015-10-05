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

import android.support.annotation.VisibleForTesting;

import java.util.ArrayList;

/**
 * Created by dubsydesktop on 9/30/2015.
 */
public class ReactionTimesList {
    private ArrayList<ReactionTimer> reactionTimes;
    private long max;
    private long min = Long.MAX_VALUE;
    private long median;
    private long average;

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

    public String maxReactionTime() {
        for(ReactionTimer x:this.reactionTimes){
            if (x.getTime() > this.max){
                this.max = x.getTime();
            }
        }
        return Long.toString(this.max);
    }

    public String minReactionTime() {
        for(ReactionTimer x:this.reactionTimes){
            if (x.getTime() < this.min){
                this.min = x.getTime();
            }
        }
        return Long.toString(this.min);
    }

    public String avgReactionTime() {
        long sum = 0;
        for(ReactionTimer x:this.reactionTimes){
            sum += x.getTime();
        }
        this.average = sum/this.reactionTimes.size();
        return Long.toString(sum/this.reactionTimes.size());
    }

    public String medReactionTime() {
        int [] times = new int[this.reactionTimes.size()];
        int i = 0;
        for(ReactionTimer x:this.reactionTimes){
            times[i] = (int) x.getTime();
            i++;
        }
        Heap_Sort myHeap = new Heap_Sort();
        int[] sortedTimes = myHeap.ascending_sort(times);
        if(sortedTimes.length % 2 == 0 && sortedTimes.length > 2){
            return Long.toString(((sortedTimes[sortedTimes.length / 2] + sortedTimes[sortedTimes.length / 2 + 1]) / 2));
        } else {
            return Long.toString(sortedTimes[sortedTimes.length / 2]);
        }
    }
}