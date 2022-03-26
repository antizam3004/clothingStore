import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//***********pomoćna klasa za format datuma*****************//
public class DateParser {

    public static LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy."));
        } catch (Exception e) {
            System.out.println("Incorrect date...");
            return null;
        }
    }
}
