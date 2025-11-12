package com.example.stardew_almanac.fish;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private static final String SEPARATOR = ",";

    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return null;
        }
        return attribute.stream()
                .map(s -> s.replace(SEPARATOR, "\\" + SEPARATOR))
                .collect(Collectors.joining(SEPARATOR));
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(dbData.split(SEPARATOR))
                .map(String::trim)
                .map(s -> s.replace("\\" + SEPARATOR, SEPARATOR))
                .collect(Collectors.toList());
    }
}

