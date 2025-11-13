package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FishRepository extends JpaRepository<Fish, String> {

    @Query(value = "SELECT * FROM fish WHERE name = :name", nativeQuery = true)
    Fish findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM fish WHERE seasons LIKE CONCAT('%', :season, '%')", nativeQuery = true)
    List<Fish> findBySeason(@Param("season") String season);

    @Query(value = "SELECT * FROM fish WHERE locations LIKE CONCAT('%', :location, '%')", nativeQuery = true)
    List<Fish> findByLocations(@Param("location") String location);

    @Query(value = "SELECT * FROM fish WHERE locations LIKE CONCAT('%', :location, '%') AND seasons LIKE CONCAT('%', :season, '%')", nativeQuery = true)
    List<Fish> findByLocationAndSeason(@Param("location") String location, @Param("season") String season);
}
