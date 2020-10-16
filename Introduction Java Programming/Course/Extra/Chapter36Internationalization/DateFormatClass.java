package com.company.Chapter36Internationalization;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatClass {
     public static void main(String[] args) {
    // This displays current time with a specified time zone (CST)
    // Formatting style (full date and full time) and locale (US)
        GregorianCalendar calendar = new GregorianCalendar();
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US);
        TimeZone timeZone = TimeZone.getTimeZone("CST");
        formatter.setTimeZone(timeZone);
        System.out.println("The local time is " + formatter.format(calendar.getTime()));
    }
}
