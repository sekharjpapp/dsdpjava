package com.pixel.zoneidsample;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneIdToGet {
    public static void main(String[] args) {
        ZoneId
                .getAvailableZoneIds()
                .forEach(System.out::println);
        String desiredTimeZone = "Asia/Kolkata";

        // Check if the desired time zone is available
        if (ZoneId.getAvailableZoneIds().contains(desiredTimeZone)) {
            System.out.println(desiredTimeZone + " is available.");
        } else {
            System.out.println(desiredTimeZone + " is not available.");
        }

        // Specify the desired time zone
        String timeZone = "Asia/Kolkata";

        // Get the current time in the specified time zone
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(timeZone));

        // Create a DateTimeFormatter for formatting the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Format the ZonedDateTime using the formatter
        String formattedTime = now.format(formatter);

        // Print the formatted time
        System.out.println("Current time in " + timeZone + ": " + formattedTime);


    }
}
