package com.example.stardew_almanac.crops;

import com.example.stardew_almanac.common.Quality;
import com.example.stardew_almanac.common.Season;
import lombok.Data;

import java.util.List;

@Data
public class Crop {

  String name;
  Season season;
  int growthTime;
  int farmingXP;
  CropType type;
  Quality quality;
  int energy;
  int health;
  int price;
  List<String> lovedBy;
  List<String> dislikedBy;

  public Crop(
      String name,
      Season season,
      int growthTime,
      int farmingXP,
      CropType type,
      Quality quality,
      int energy,
      int health,
      int price,
      List<String> lovedBy,
      List<String> dislikedBy) {
    this.name = name;
    this.season = season;
    this.growthTime = growthTime;
    this.farmingXP = farmingXP;
    this.type = type;
    this.quality = quality;
    this.energy = energy;
    this.health = health;
    this.price = price;
    this.lovedBy = lovedBy;
    this.dislikedBy = dislikedBy;
  }
}
