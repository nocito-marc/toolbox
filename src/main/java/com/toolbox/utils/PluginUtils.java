package com.toolbox.utils;

import com.toolbox.exception.InvalidDataException;

import java.time.YearMonth;

public class PluginUtils {


    private PluginUtils() {
        // ras.
    }

    public static String truncate(String value, int length) {
        if (value != null && value.length() > length) {
            value = value.substring(0, length);
        }
        return value;
    }


    /**
     * Check if a String is null or empty
     *
     * @param value the String to check
     * @return
     */
    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static YearMonth createYearMonthFromExpiry(String expiry) {
        if (isEmpty(expiry) || expiry.length() != 4) {
            throw new InvalidDataException("expiry must be 4 digit, not:" + expiry);

        }
        int month = Integer.parseInt(expiry.substring(0, 2));
        int year = 2000 + Integer.parseInt(expiry.substring(2, 4));

        return YearMonth.of(year, month);

    }
}