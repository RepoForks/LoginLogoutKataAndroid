package com.karumi.loginlogoutkata.common;

public class StringUtils {
    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }

    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
