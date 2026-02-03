package com.example.stardew_almanac.villagers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VillagerRepository extends JpaRepository<Villager, String> {

    @Query(value = "SELECT * FROM villagers WHERE name = :name", nativeQuery = true)
    Villager findByName(@Param("name") String name);
}
