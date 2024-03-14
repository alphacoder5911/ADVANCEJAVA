import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformat {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();//THIS IS THE DATE 
        System.out.println(dt);
        //BELOW IS THE DATE FORMATED 
        DateTimeFormatter df=DateTimeFormatter.ofPattern("DD/MM/YY  --E  --a  --y");
        DateTimeFormatter d=DateTimeFormatter.ISO_DATE;
        String myd=dt.format(df);//FORMAT TRANSFERED TO THE STRING 
        System.out.println(myd);
    }
}
