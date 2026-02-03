package com.example.stardew_almanac.items;

import jakarta.persistence.Id;
import lombok.Data;

@Data
// @Table(name = "items")
public class Item {
    // protected int id;
    @Id
    protected String name;
    protected ItemType type;

    public Item(String name, ItemType type) {
        // this.id = id;
        this.name = name;
        this.type = type;
    }

    public Item() {
    }
}
