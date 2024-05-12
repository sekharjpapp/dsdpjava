package com.pixel.sealedclssample.exsealtime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClientSample {
    public static LocalDateTime process(TimeOfTheDay timeOfTheDay) {
        if (timeOfTheDay instanceof DayTime) {
            ZoneId zoneId = ZoneId.of("America/New_York");
            return LocalDateTime.now(zoneId);
        } else if (timeOfTheDay instanceof NightTime) {
            ZoneId zoneIdIndia = ZoneId.of("Asia/Kolkata");
            return LocalDateTime.now(zoneIdIndia);
        }
        return LocalDateTime.now();
    }
    public static void main(String[] args) {
        System.out.println(process(new DayTime()));
        System.out.println(process(new NightTime()));
    }
}
