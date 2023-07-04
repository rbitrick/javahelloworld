import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(
            ZoneId.systemDefault()
        );

        DateTimeFormatter dateformatted = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = time.format(dateformatted);
        System.out.println("Hello everyone! The current date and time is: " + formattedDate);
    }
}