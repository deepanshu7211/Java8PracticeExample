package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("local date " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Lcoal time " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(" localdate time " + localDateTime);

        System.out.println(" to local date from LocalDateTIme " + localDateTime.toLocalDate());
        System.out.println(" to localTime from LocalDateTIme " + localDateTime.toLocalTime());

//        Instant Example for Machine Readable time format i.e EPOCH
        Instant instant = Instant.now();
        System.out.println(" Instant " + instant);
        System.out.println(" Epoch timestamp " + instant.getEpochSecond());
    }
}
