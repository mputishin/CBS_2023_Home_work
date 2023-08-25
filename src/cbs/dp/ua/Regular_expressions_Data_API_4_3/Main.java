package cbs.dp.ua.Regular_expressions_Data_API_4_3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Прошу вибачення! Ліпив з говна та палок, але начебто працює(((((

public class Main {
    public static void main(String[] args) throws Exception {

        String myBirthday = "09.06.1980";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");         //для переводу в LocalDate
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");                //для переводу в Date
        LocalDate myDate = LocalDate.parse(myBirthday, formatter);
        LocalDate nowDate = LocalDate.now();
        Period period = Period.between(myDate, nowDate);                                //отримання різниці між двома датами в роках, місяцях, днях

        int years = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();

        myDate = myDate.plusYears(years);
        myDate = myDate.plusMonths(month);
        myDate = myDate.plusDays(day);                                                  //отримання согоднішньої дати з нуля годин

        Date time1 = new Date();                                                        //початок розрахунку годин та хвилин
        Date time2 = sdf.parse(String.valueOf(myDate));                                 //перевод LocalDate в Date
        long time = time1.getTime() - time2.getTime();                                  //отримання різниці між теперяшнім часом та північью

        int hours =(int) (((time/1000)/60)/60);
        int tmp = hours*1000*60*60;
        int minutes =(int) (((time-tmp)/1000)/60);                                      // ну тут вже просто!

        System.out.println(" Лет:" + years + " Месяцев:"+ month + " Дней:" + day + " Часов:" + hours + " Минут:" + minutes);
    }
}
