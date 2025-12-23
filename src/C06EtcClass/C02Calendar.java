package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
////        java.util패키지의 Calendar클래스
//        Calendar myCalendar= Calendar.getInstance();
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));  //클래스명.변수명 static변수 처럼 사용되는 enum타입
//        System.out.println(myCalendar.get(Calendar.MONTH)+1); //12월인데 11로 표시됨(0부터시작)
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK)); //요일 숫자로표시(일~토 1~7?)
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(myCalendar.get(Calendar.HOUR));
//        System.out.println(myCalendar.get(Calendar.MINUTE));
//        System.out.println(myCalendar.get(Calendar.SECOND));

////        java.time패키지의 LocalDateTime, LocalDate, LocalTime클래스 (더 많이 쓰임)
//        LocalDate myLocalDate = LocalDate.now();
//        System.out.println(myLocalDate);
//        System.out.println(myLocalDate.getYear());
//        System.out.println(myLocalDate.getMonth()); //DECEMBER
//        System.out.println(myLocalDate.getMonthValue()); //12
//        System.out.println(myLocalDate.getDayOfMonth()); //23
//        System.out.println(myLocalDate.getDayOfWeek()); //TUESFDAY

//        LocalTime myLocalTime = LocalTime.now();
//        System.out.println(myLocalTime.getHour());
//        System.out.println(myLocalTime.getMinute());
//        System.out.println(myLocalTime.getSecond());

//        LocalDateTime myLocalDateTime = LocalDateTime.now();
//        System.out.println(myLocalDateTime.getYear());
//        System.out.println(myLocalDateTime.getHour());
////        ChronoField매개변수로 다양한 형식의 날짜/시간정보 조회
//        System.out.println(myLocalDateTime.get(ChronoField.YEAR));
//        System.out.println(myLocalDateTime.get(ChronoField.MONTH_OF_YEAR)); //12
//        System.out.println(myLocalDateTime.get(ChronoField.AMPM_OF_DAY)); //0:오전 1:오후
//        System.out.println(myLocalDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); //24시체계

//        .of : 임의로 특정시간정보객체를 만들어내고 싶을 때 사용
        LocalDate birthDay = LocalDate.of(2000,11,12);
        System.out.println(birthDay);

        LocalDateTime birthDayTime = LocalDateTime.of(2000, 11, 12, 15, 14, 11);
        System.out.println(birthDayTime);   //결과값  2000-11-12T15:14:11


    }
}
