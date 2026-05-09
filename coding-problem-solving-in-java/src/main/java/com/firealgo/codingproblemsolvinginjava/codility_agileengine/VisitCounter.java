package com.firealgo.codingproblemsolvinginjava.codility_agileengine;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class VisitCounter {
    public static void main(String[] args) {

        var list = new Map[]{
                Map.of("101", new UserStats(Optional.of(4L)), "202", new UserStats(Optional.of(4L))),
                Map.of("103", new UserStats(Optional.of(1L)), "101", new UserStats(Optional.of(4L))),
                Map.of("202", new UserStats(Optional.empty()), "103", new UserStats(Optional.of(4L))),
        };


//        var res = count(map);
        System.out.println(countJava8());
    }

    static Map<Long, Long> countJava8(Map<String, UserStats>... visits) {
        Map<Long, Long> res = new HashMap<>();
        if (visits == null || visits.length < 1) {
            return res;
        }

        for (Map<String, UserStats> visit : visits) {
            if (visit != null) {
                for (Map.Entry<String, UserStats> entry : visit.entrySet()) {
                    if (entry.getValue() != null && entry.getValue().getVisitCount().isPresent() && isNumeric(entry.getKey())) {
                        Long value = entry.getValue().getVisitCount().get();
                        res.put(Long.valueOf(entry.getKey()), res.getOrDefault(Long.valueOf(entry.getKey()), 0L) + value);
                    }

                }
            }
        }
        return res;
    }

//    static Map<Long, Long> count(Map<String, UserStats>... visits) {
//        var res = Arrays.stream(visits).filter(visit -> visit != null)
//                .collect(
//                Collectors.groupingBy(e -> Long.valueOf(e))
//                );
//    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
