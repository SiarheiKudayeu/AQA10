package lesson8.c_formatter;

import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);

        //спецификаторы формата
        //%t, %T

        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am
        System.out.printf("Print date in nex format: %tH\n", date);
        System.out.printf("Print date in nex format: %tM\n", date);
        System.out.printf("Print date in nex format: %tS\n", date);
        System.out.printf("Print date in nex format: %1$tH:%1$tM:%1$tS\n", date);

        //A - день недели, d - две цифры даты , B - месяц, m - месяц в виде цифры,
        // Y - год, y - две фин цифры года

        System.out.printf("Print date in nex format:  %1$tA %1$td %1$tB\n", date);

        String textTodayDate = String.format("%td", date);
        int todayDate = Integer.parseInt(textTodayDate);
        int tomorrowDate = todayDate + 1;
        System.out.println(tomorrowDate);
        System.out.println(Integer.parseInt(String.format("%td", date)) + 1);


    }
}
