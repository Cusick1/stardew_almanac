package com.example.stardew_almanac.common;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Season {
    SPRING(1),
    SUMMER(2),
    FALL(3),
    WINTER(4),
    ANY(5);

    private final int id;

    Season(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private static final Map<Integer, Season> ID_TO_SEASON_MAP =
            Arrays.stream(values()).collect(Collectors.toMap(Season::getId, s -> s));

    public static Season fromId(int id) {
        return ID_TO_SEASON_MAP.get(id);
    }

}
