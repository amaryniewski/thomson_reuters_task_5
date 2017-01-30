package reuters.thomson;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrianmaryniewski on 30.01.2017.
 */
public class AddingWorkdays {

    public static List<LocalDate> addNumberOfWorkdays(LocalDate date, int workdays) {

        List<LocalDate> dateList = new ArrayList<>();

        LocalDate result = date;
        int addedDays = 0;
        while (addedDays < workdays) {
            result = result.plusDays(1);

            if (!(result.getDayOfWeek() == DayOfWeek.SATURDAY || result.getDayOfWeek() == DayOfWeek.SUNDAY)) {

                ++addedDays;
                dateList.add(result);
            }
        }
        System.out.println(dateList);
        return dateList;
    }

}
