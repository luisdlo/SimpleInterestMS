package com.aplazo.simpleinterest.util;

import java.time.LocalDate;

public class SimpleInterestUtil {
    public static Double calculateSimpleInterest(Double amount, Double rate, Integer terms) {
        return (amount * rate * terms / 100) + amount;
    }

    public static LocalDate calculateDayWeekly(LocalDate localDate) {
        return localDate.plusWeeks(1);
    }
}
