package com.leetcode;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class LogStorageSystem {
    TreeSet<Log> treeSet = new TreeSet<>(Comparator.comparing(l -> l.date));
    public void put(int id, String timestamp) {
        treeSet.add(new Log(id, timestamp));
    }

    public List<Integer> retrieve(String start, String end, String granularity) {
        LocalDateTime stime = toDate(start);
        LocalDateTime etime = toDate(end);
        switch (granularity) {
            case "Year":        //Consider the years only nothing after that also to make inclusive start and end include last year and future year of start and end respectively.
                LocalDateTime sd = stime.minusYears(1).withMonth(12).withDayOfMonth(31).withHour(23).withMinute(59).withSecond(59);
                LocalDateTime ed = etime.plusYears(1).withMonth(1).withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
            case "Month":       //Month addition but handle by calendar class.
                Calendar cal = Calendar.getInstance(TimeZone.getDefault());
                cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                LocalDateTime d = stime.minusMonths(1);
                cal.set(d.getYear(), d.getMonth().getValue() -1, d.getDayOfMonth());
                sd = d.withDayOfMonth(cal.getActualMaximum(Calendar.DAY_OF_MONTH)).withHour(23).withMinute(59).withSecond(59);
                ed = etime.plusMonths(1).withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
            case "Day":
                sd = stime.minusDays(1).withHour(23).withMinute(59).withSecond(59);
                ed = etime.plusDays(1).withHour(0).withMinute(0).withSecond(0);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
            case "Hour":
                sd = stime.minusHours(1).withMinute(59).withSecond(59);
                ed = etime.plusHours(1).withMinute(0).withSecond(0);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
            case "Minute":
                sd = stime.minusMinutes(1).withSecond(59);
                ed = etime.plusMinutes(1).withSecond(0);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
            case "Second":
                sd = stime.minusSeconds(1);
                ed = etime.plusSeconds(1);
                return treeSet.subSet(new Log(1, sd), new Log(1, ed)).stream().map(l -> l.id).collect(Collectors.toList());
        }
        return null;
    }


    class Log {
        int id;
        LocalDateTime date;

        public Log(int id, String date) {
            this.id = id;
            LocalDateTime of = toDate(date);
            this.date = of;
        }

        public Log(int id, LocalDateTime date) {
            this.id = id;
            this.date = date;
        }
    }

    private LocalDateTime toDate(String date) {
        String[] inputDate = date.split(":");
        LocalDateTime of = LocalDateTime.of(Integer.parseInt(inputDate[0]),
                Integer.parseInt(inputDate[1]),
                Integer.parseInt(inputDate[2]),
                Integer.parseInt(inputDate[3]),
                Integer.parseInt(inputDate[4]),
                Integer.parseInt(inputDate[5]));
        return of;
    }
}
