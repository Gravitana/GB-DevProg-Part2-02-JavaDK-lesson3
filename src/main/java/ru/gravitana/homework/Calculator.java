package ru.gravitana.homework;

public class Calculator {
    public static <T1 extends Number, T2 extends Number> String sum(T1 t1, T2 t2) {
        return "" + (toDouble(t1) + toDouble(t2));
    }

    public static <T1 extends Number, T2 extends Number> String multiply(T1 t1, T2 t2) {
        return "" + (toDouble(t1) * toDouble(t2));
    }

    public static <T1 extends Number, T2 extends Number> String divide(T1 t1, T2 t2) {
        double num2 = toDouble(t2);
        if (num2 == 0.0) {
            return "Ошибка. Деление на 0";
        }

        return "" + (toDouble(t1) / num2);
    }

    public static <T1 extends Number, T2 extends Number> String subtract(T1 t1, T2 t2) {
        return "" + (toDouble(t1) - toDouble(t2));
    }

    private static <T extends Number> double toDouble(T t) {
        return Double.parseDouble((String.valueOf(t)));
    }
}
