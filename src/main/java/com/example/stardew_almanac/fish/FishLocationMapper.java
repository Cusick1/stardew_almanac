package com.example.stardew_almanac.fish;

import java.util.Map;

public class FishLocationMapper {
    private static final Map<Integer, String> LOCATION_MAP = Map.ofEntries(
            Map.entry(1, "ocean"),
            Map.entry(2, "ginger island oceans"),
            Map.entry(3, "forest river"),
            Map.entry(4, "town river"),
            Map.entry(5, "the mountain lake"),
            Map.entry(6, "forest pond"),
            Map.entry(7, "secret woods pond"),
            Map.entry(8, "the sewers"),
            Map.entry(9, "the witch's swamp"),
            Map.entry(10, "the mines 20f & 60f"),
            Map.entry(11, "the mines 20f"),
            Map.entry(12, "the mines 60f"),
            Map.entry(13, "the mines 100f"),
            Map.entry(14, "volcano caldera"),
            Map.entry(15, "the desert"),
            Map.entry(16, "cindersap forest pond"),
            Map.entry(17, "ginger island pond"),
            Map.entry(18, "ginger island rivers"),
            Map.entry(19, "forest farm"),
            Map.entry(20, "mutant bug lair"),
            Map.entry(21, "pirate cove"),
            Map.entry(22, "forest waterfalls"),
            Map.entry(23, "night market")
    );

    public static String getLocationById(int id) {
        return LOCATION_MAP.get(id);
    }

    public static int getIdByLocation(String location) {
        return LOCATION_MAP.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equalsIgnoreCase(location))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1); // Return -1 if not found
    }
}
