package com.example.stardew_almanac.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    @Query(value = "SELECT * FROM items WHERE name = :name", nativeQuery = true)
    Item findByName(@Param("name") String name);
}