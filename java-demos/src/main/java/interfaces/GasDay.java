package interfaces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GasDay {

    LocalDate localDate;

    // Util osztályban lévő metódusokat ki lehet váltani static create metódusokkal
    public static GasDay createFromLocalDateTime(LocalDateTime time) {
        return null;
    }

    // Util osztályban lévő metódusokat ki lehet váltani példány metódusokkal
    public LocalDateTime getStart() {
        return null;
    }
}
