import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class timeapi {
    public static void main(String[] args) {
        LocalDate l =LocalDate.now();
        System.out.println(l);

        LocalTime lo=LocalTime.now();
        System.out.println(lo);

        LocalDateTime ll=LocalDateTime.now();
        System.out.println(ll);//IT HAS NANO SECONDS ALSO , IT ENSURES ACCURRACY 
    }
}
