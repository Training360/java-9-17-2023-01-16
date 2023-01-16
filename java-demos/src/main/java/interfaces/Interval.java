package interfaces;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Interval {

    LocalDate start;

    LocalDate end;
}
