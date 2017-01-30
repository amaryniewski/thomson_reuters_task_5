package reuters.thomson;

import java.time.LocalDate;

/**
 * Created by adrianmaryniewski on 25.01.2017.
 */
public class Main {

        public static void main(String[] args) {
            AddingWorkdays runner = new AddingWorkdays();
            LocalDate date = LocalDate.of(2017, 1, 30);
            runner.addNumberOfWorkdays(date, 14);
        }
    }