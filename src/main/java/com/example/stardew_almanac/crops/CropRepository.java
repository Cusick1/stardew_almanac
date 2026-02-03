package com.example.stardew_almanac.crops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CropRepository extends JpaRepository<Crop, String> {
    @Query(value = "SELECT * FROM crops WHERE name = :name", nativeQuery = true)
    Crop findByName(@Param("name") String name);

}
