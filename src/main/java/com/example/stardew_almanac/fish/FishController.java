package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fish")
public class FishController {

    private final FishService fishService;

    @Autowired
    public FishController(FishService fishService) {
        this.fishService = fishService;
    }

    @GetMapping
    public List<Fish> getFish() {
        return fishService.getFish();
    }

    @GetMapping("/{name}")
    public Fish getFishByName(@PathVariable String name) {
        return fishService.getFishByName(name);
    }

    @GetMapping("/{seasons}")
    public List<Fish> getFishBySeasons(@PathVariable Season season) {
        return fishService.getFishBySeason(season);
    }

    @GetMapping("/{location}")
    public List<Fish> getFishByLocation(
            @RequestParam(value = "season", required = false) Season season,
            //      @RequestParam(value = "season", required = false) String seasons,
            @PathVariable String location) {
        if (season != null) {
            //      List<String> seasonList = List.of(season.split(","));
            return fishService.getFishByLocations(location, season);
        } else {
            return fishService.getFishByLocations(location);
        }
    }
}
