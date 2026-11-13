package mz.co.biodiversity.controller.converter;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.ConverterException;
import jakarta.faces.convert.FacesConverter;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/** Converte OffsetDateTime <-> "dd/MM/yyyy HH:mm" (fuso Africa/Maputo). */
@FacesConverter(forClass = OffsetDateTime.class)
public class OffsetDateTimeConverter implements Converter<OffsetDateTime> {
    private static final ZoneId ZONE = ZoneId.of("Africa/Maputo");
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public OffsetDateTime getAsObject(FacesContext ctx, UIComponent c, String value) {
        if (value == null || value.isBlank()) return null;
        try {
            return LocalDateTime.parse(value.trim(), FMT).atZone(ZONE).toOffsetDateTime();
        } catch (DateTimeParseException e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Data/hora inválida", "Use o formato dd/MM/aaaa HH:mm"));
        }
    }

    @Override
    public String getAsString(FacesContext ctx, UIComponent c, OffsetDateTime value) {
        return value == null ? "" : value.atZoneSameInstant(ZONE).format(FMT);
    }
}
