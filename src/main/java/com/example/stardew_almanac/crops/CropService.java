package com.example.stardew_almanac.crops;

import com.example.stardew_almanac.common.Season;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropService {

  private CropRepository cropRepository;

  // private final List<Crop> crops = List.of(
  // new Crop(
  // "Parsnip",
  // Season.SPRING,
  // 4,
  // 8,
  // CropType.VEGETABLE,
  // Quality.NORMAL,
  // 18,
  // 0,
  // 35,
  // List.of("Abigail", "Emily"),
  // List.of("Penny")),
  // new Crop(
  // "Cauliflower",
  // Season.SPRING,
  // 12,
  // 50,
  // CropType.VEGETABLE,
  // Quality.NORMAL,
  // 75,
  // 0,
  // 175,
  // List.of("Haley", "Leah"),
  // List.of("Alex")));

  public Crop getCropsByName(String name) {
    return cropRepository.findByName(name);
  }
}
