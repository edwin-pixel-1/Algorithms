package com.edwin.cobos.exercises;

import java.util.*;

public class OverlappingIntervals {

    public OverlappingIntervals() {
        List<Interval> list = Arrays.asList(
                new Interval(1, 3),
                new Interval(8, 10),
                new Interval(15, 18),
                new Interval(2, 6));

        List<Interval> result = merge(list);

        System.out.println("Result: " + Arrays.deepToString(list.toArray()));
        System.out.println("Result: " + Arrays.deepToString(result.toArray()));
    }

    private List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0)
            return Collections.emptyList();

        if (intervals.size() == 1)
            return intervals;

        Collections.sort(intervals);

        LinkedList<Interval> result = new LinkedList<>();
        result.add(intervals.get(0));

        for (Interval current : intervals) {
            if (current.start > result.getLast().end) {
                result.add(current);
            } else {
                result.getLast().end = Math.max(result.getLast().end, current.end);
            }
        }

        return result;
    }

    public class Interval implements Comparable<Interval> {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", start, end);
        }

        @Override
        public int compareTo(Interval o) {
            return Integer.compare(this.start, o.start);
        }
    }

}
