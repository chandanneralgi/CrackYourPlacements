class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int lastEnd = intervals[0][1];
        int count = 1;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= lastEnd){
                count++;
                lastEnd = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}