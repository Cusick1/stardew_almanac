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

    @Query(value = "SELECT f.* FROM fish f JOIN fish_seasons fs on f.id = fs.fish_id WHERE fs.season_id = :seasonId;", nativeQuery = true)
    List<Fish> findBySeason(@Param("seasonId") int seasonId);

    @Query(value = "SELECT f.* FROM fish f JOIN fish_locations fl on f.id = fl.fish_id WHERE fl.location_id = :locationId;", nativeQuery = true)
    List<Fish> findByLocations(@Param("locationId") int locationId);

    @Query(value = "SELECT f.* FROM fish f " +
            "JOIN fish_locations fl on f.id = fl.fish_id " +
            "JOIN fish_seasons fs on f.id = fs.fish_id " +
            "WHERE fl.location_id = :locationId " +
            "AND fs.season_id = :seasonId;", nativeQuery = true)
    List<Fish> findByLocationAndSeason(@Param("locationId") int location, @Param("seasonId") int season);
}
