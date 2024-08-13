import java.time.*;
public class DateTime {
    public static void main(String[] args) {
        //Today's Date
        LocalDate date=LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        //Present Time
        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
       
        //Both Date & Time
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
