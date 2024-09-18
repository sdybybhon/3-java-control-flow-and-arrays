package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            return "В году всего 12 месяцев, братишка)))))";
        } else if (monthNumber == 12 || monthNumber <= 2) {
            return "зима";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }
    }
}