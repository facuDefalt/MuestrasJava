/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, String> {

    @Override
    public String convertToDatabaseColumn(LocalDateTime attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public LocalDateTime convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        return LocalDateTime.parse(dbData, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
