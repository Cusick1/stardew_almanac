package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "fish")
public class Fish {
    @Id
    private String name;
    private String description;
    private String time;
    private String weather;
    private int xp;
    private int price;
    private List<Season> seasons;
    private List<String> locations;
    private List<String> usedIn;

    public Fish(
            String name,
            String description,
            String time,
            String weather,
            int xp,
            int price,
            List<Season> seasons,
            List<String> locations,
            List<String> usedIn) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.weather = weather;
        this.xp = xp;
        this.price = price;
        this.seasons = seasons;
        this.locations = locations;
        this.usedIn = usedIn;
    }

    public Fish() {
    }
}

