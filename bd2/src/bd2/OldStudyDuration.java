package bd2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OldStudyDuration {
	public long elementaryTotalExtraDays;
	public long middleTotalExtraDays;
	public long highTotalExtraDays;
	public long higherEdTotalExtraDays;
    public OldStudyDuration(long elementaryTotalExtraDays, long middleTotalExtraDays, long highTotalExtraDays, long higherEdTotalExtraDays ) {
    	this.elementaryTotalExtraDays = elementaryTotalExtraDays;
    	this.middleTotalExtraDays = middleTotalExtraDays;
    	this.highTotalExtraDays = highTotalExtraDays;
    	this.higherEdTotalExtraDays = higherEdTotalExtraDays;
        LocalDate elementarySchoolStartDate = LocalDate.of(1978, 9, 1);
        LocalDate elementarySchoolEndDate = LocalDate.of(1981, 9, 1);
        //бага анги
        LocalDate middleSchoolStartDate = LocalDate.of(1981, 9, 1);
        LocalDate middleSchoolEndDate = LocalDate.of(1986, 9, 1);
        //дунд анги
        LocalDate highSchoolStartDays = LocalDate.of(1986, 9, 1);
        LocalDate highSchoolEndDays = LocalDate.of(1988, 9, 1); 
        //ахлах анги
        LocalDate higherEdStartDate = LocalDate.of(1988, 9, 1);
        LocalDate higherEdEndDate = LocalDate.of(1993, 9, 1); 
        //дээд сургууль
        long elementarySchoolDays = getDaysBetween(elementarySchoolStartDate, elementarySchoolEndDate);
        long middleSchoolDays = getDaysBetween(middleSchoolStartDate, middleSchoolEndDate);
        long highSchoolDays = getDaysBetween(highSchoolStartDays, highSchoolEndDays);
        long higherEdDate = getDaysBetween(higherEdStartDate, higherEdEndDate);
        
        int elementaryNumberOfYears = 3;
        int middleNumberOfYears = 5;
        int highNumberOfYears = 2;
        int higherEdNumberOfYears = 5;
        long extraDaysPerYear = 30+31+31; // 6, 7, 8-р сарууд

         elementaryTotalExtraDays = elementarySchoolDays - (extraDaysPerYear * elementaryNumberOfYears);
         middleTotalExtraDays = middleSchoolDays - (extraDaysPerYear * middleNumberOfYears);
         highTotalExtraDays = highSchoolDays - (extraDaysPerYear * highNumberOfYears);
         higherEdTotalExtraDays = higherEdDate - (extraDaysPerYear * higherEdNumberOfYears );
  
    }

    public long getDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
                         
