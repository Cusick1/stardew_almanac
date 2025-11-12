package com.example.stardew_almanac.fish;

import com.example.stardew_almanac.common.Season;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class SeasonListConverter implements AttributeConverter<List<Season>, String> {

    private static final String SEPARATOR = ",";

    @Override
    public String convertToDatabaseColumn(List<Season> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return null;
        }
        return attribute.stream()
                .map(Season::toString)
                .collect(Collectors.joining(SEPARATOR));
    }

    @Override
    public List<Season> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(dbData.split(SEPARATOR))
                .map(String::trim)
                .map(Season::valueOf)
                .collect(Collectors.toList());
    }
}
