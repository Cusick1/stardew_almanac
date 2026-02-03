package com.example.stardew_almanac.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    ItemService() {
    }

    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    public Item getItemByName(String name) {
        if (name == null) {
            name = "";
        }
        return itemRepository.findById(name).orElse(null);
    }

}
