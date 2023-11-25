// Meeting Rooms
// Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.

// Example 1:

// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false
// Example 2:

// Input: intervals = [[7,10],[2,4]]
// Output: true

import java.util.*;

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1]>intervals[i][0])
                return false;
        }
        return true;
    }
}
