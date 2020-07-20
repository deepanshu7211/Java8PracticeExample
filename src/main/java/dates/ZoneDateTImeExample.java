package dates;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTImeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(" zonedDate TIme " + zonedDateTime);
        System.out.println(" zonedDate TIme ZoneOffSet " + zonedDateTime.getOffset());
        System.out.println(" zonedDate TIme zoneId " + zonedDateTime.getZone());

        System.out.println(" zonedate time for other zones " +
                ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("locatDateTime 1 withouttimezone "  + localDateTime1 );
        ZonedDateTime zonedDateTime1 = localDateTime1.atZone(ZoneId.of("America/Chicago"));
        System.out.println(" zonedDateTime1 with timezone " +zonedDateTime1);
    }
}
