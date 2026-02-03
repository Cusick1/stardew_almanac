package com.example.stardew_almanac.items;

import com.example.stardew_almanac.common.Quality;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "items")
public class Item {
    @Id
    protected String name;
    protected ItemType type;
    protected Quality quality;

    public Item(String name, ItemType type, Quality quality) {
        this.name = name;
        this.type = type;
        this.quality = quality;
    }

    public Item() {
    }
}
