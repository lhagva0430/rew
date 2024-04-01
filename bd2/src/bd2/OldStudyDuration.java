package bd2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OldStudyDuration {
    public long elementaryTotalExtraDays[] = new long[3];
    public long middleTotalExtraDays[] = new long[5];
    public long highTotalExtraDays[] = new long[2];
    public long higherEdTotalExtraDays[] = new long[5];
    
    public OldStudyDuration() {
        
        long extraDaysPerYear = 30 + 31 + 31; // 6, 7, 8-р сарууд

        for (int i = 0; i < 15; i++) {
        	int a = 1978 + i;
            LocalDate startDate = LocalDate.of(a, 9, 1);
            LocalDate endDate = LocalDate.of(a + 1, 9, 1);
            long days = getDaysBetween(startDate, endDate);
            System.out.println(days);

            if (i < 3) {
                elementaryTotalExtraDays[i] = days -  extraDaysPerYear;
            } else if (i < 8) {
                middleTotalExtraDays[i - 3] = days - extraDaysPerYear ;
            } else if (i < 10) {
                highTotalExtraDays[i - 8] = days - extraDaysPerYear ;
            } else {
                higherEdTotalExtraDays[i - 10] = days - extraDaysPerYear ;
            }
        }
    }

    public long getDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

}
