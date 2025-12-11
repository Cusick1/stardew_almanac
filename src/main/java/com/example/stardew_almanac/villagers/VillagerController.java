package com.example.stardew_almanac.villagers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/villagers")
public class VillagerController {

    private final VillagerService villagerService;

    @Autowired
    VillagerController(VillagerService villagerService) {
        this.villagerService = villagerService;
    }

    @GetMapping()
    public List<Villager> getVillagers() {
        return villagerService.getVillagers();
    }

    @GetMapping("/name/{name}")
    public Villager getVillagerByName(@PathVariable String name) {
        return villagerService.getVillagerByName(name);
    }
}
