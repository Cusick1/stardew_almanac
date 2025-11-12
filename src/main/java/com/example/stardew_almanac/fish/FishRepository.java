package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FishRepository extends JpaRepository<Fish, String> {

    //TODO: Fix queries to use proper JPQL syntax for lists
    @Query(value = "SELECT f FROM fish WHERE f.seasons LIKE '%:season%'", nativeQuery = true)
    List<Fish> findBySeason(String season);

    @Query(value = "SELECT f FROM fish WHERE f.locations LIKE '%:location%'", nativeQuery = true)
    List<Fish> findByLocations(String location);

    @Query(value = "SELECT f FROM fish WHERE f.seasons LIKE '%:season%' AND f.locations LIKE '%:location%'", nativeQuery = true)
    List<Fish> findByLocationAndSeason(String location, Season season);
}
