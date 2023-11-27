// Meeting Scheduler
// Given the availability time slots arrays slots1 and slots2 of two people and a meeting duration duration, return the earliest time slot that works for both of them and is of duration duration.

// If there is no common time slot that satisfies the requirements, return an empty array.

// The format of a time slot is an array of two elements [start, end] representing an inclusive time range from start to end.

// It is guaranteed that no two availability slots of the same person intersect with each other. That is, for any two time slots [start1, end1] and [start2, end2] of the same person, either start1 > end2 or start2 > end1.

// Example 1:

// Input: slots1 = [[10,50],[60,120],[140,210]], slots2 = [[0,15],[60,70]], duration = 8
// Output: [60,68]
// Example 2:

// Input: slots1 = [[10,50],[60,120],[140,210]], slots2 = [[0,15],[60,70]], duration = 12
// Output: []

import java.util.*;

class Solution {
    public int[] minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1,(a,b)->a[0]-b[0]);
        Arrays.sort(slots2,(a,b)->a[0]-b[0]);
        
        int availableDuration[];
        int s1 = 0,s2=0;
        
        while(s1<slots1.length && s2<slots2.length){
            
            int person1Slot[] = slots1[s1];
            int person2Slot[] = slots2[s2];
            
            int startTime = Math.max(person1Slot[0],person2Slot[0]);
            int endTime = Math.min(person1Slot[1],person2Slot[1]);
            
            if(endTime-startTime >= duration){
                availableDuration =new int[]{startTime,startTime+duration};
                return availableDuration;
            }
            
            if(person1Slot[1] < person2Slot[1])
                s1++;
            else
                s2++;
        }
        return new int[0];
        
        
    }
}
