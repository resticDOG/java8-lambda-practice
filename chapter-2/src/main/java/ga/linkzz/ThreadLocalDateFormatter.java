package ga.linkzz;

import javax.swing.text.DateFormatter;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThreadLocalDateFormatter {

    private final ThreadLocal<DateFormatter> dtf;

    public ThreadLocalDateFormatter() {
        this.dtf = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
    }

    public String getDate() throws ParseException {
        DateFormatter dateFormatter = dtf.get();
        Calendar calendar = new Calendar.Builder()
                .setDate(1970, Calendar.JANUARY, 1)
                .build();
        return dateFormatter.valueToString(calendar.getTime());
    }

    
}
