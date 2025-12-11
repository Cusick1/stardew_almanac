package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Convert;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "fish")
public class Fish {
    @Id
    private String name;
    private String description;
    private String weather;
    private int xp;
    private int price;
    @Convert(converter = StringListConverter.class)
    private List<String> usedIn;

    public Fish(
            String name,
            String description,
            String weather,
            int xp,
            int price,
            List<String> usedIn) {
        this.name = name;
        this.description = description;
        this.weather = weather;
        this.xp = xp;
        this.price = price;
        this.usedIn = usedIn;
    }

    public Fish() {
    }
}
