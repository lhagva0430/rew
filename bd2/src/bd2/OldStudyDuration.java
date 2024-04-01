package bd2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OldStudyDuration {
    public long elementaryTotalExtraDays;
    public long middleTotalExtraDays;
    public long highTotalExtraDays;
    public long higherEdTotalExtraDays;
    int k = 0;

    public OldStudyDuration() {

        long extraDaysPerYear = 30 + 31 + 31; // 6, 7, 8-р сарууд

        for (int i = 0; i < 15; i++) {
            int a = 1978 + i;
            LocalDate startDate = LocalDate.of(a, 9, 1);
            if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
                DayOfWeek day = new DayOfWeek(a, 9, 1);
                int s = day.getDayOfWeek();
                if (s == 1) {
                    k = 1;
                } else {
                    k = 0;
                }
            }
            LocalDate endDate = LocalDate.of(a + 1, 9, 1);
            long days = getDaysBetween(startDate, endDate);

            if (i < 3) {
                elementaryTotalExtraDays += days - extraDaysPerYear - 39 - k;
            } else if (i < 8) {
                middleTotalExtraDays += days - extraDaysPerYear - 39 - k;
            } else if (i < 10) {
                highTotalExtraDays += days - extraDaysPerYear - 39 - k;
            } else {
                higherEdTotalExtraDays += days - extraDaysPerYear - 39 - k;
            }
        }
    }

    public long getDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    // Getter methods
    public long getElementaryTotalExtraDays() {
        return elementaryTotalExtraDays;
    }

    public long getMiddleTotalExtraDays() {
        return middleTotalExtraDays;
    }

    public long getHighTotalExtraDays() {
        return highTotalExtraDays;
    }

    public long getHigherEdTotalExtraDays() {
        return higherEdTotalExtraDays;
    }
}
