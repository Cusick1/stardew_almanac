package com.example.stardew_almanac.villagers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillagerRepository extends JpaRepository<Villager, String> {
}
