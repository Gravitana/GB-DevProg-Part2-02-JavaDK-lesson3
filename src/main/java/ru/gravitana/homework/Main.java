package ru.gravitana.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Calculator -----");

        int num1 = 5;
        double num2 = 2.5;
        System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
        System.out.println(num1 + " / " + 0 + " = " + Calculator.divide(num1, 0));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));

        System.out.println("----------------------------------------------------------");
        System.out.println("----- CompareArrays -----");

        ArrayList<Object> array1 = new ArrayList<>();
        array1.add("string");
        array1.add(8);
        array1.add(4.3);
        array1.add("str");

        ArrayList<Object> array2 = new ArrayList<>();
        array2.add("1231231");
        array2.add(25);
        array2.add(0.8);
        array2.add("---");

        if (compareArrays(array1, array2)) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }



    }

    private static <T1, T2> boolean compareArrays(ArrayList<T1> arr1, ArrayList<T2> arr2) {
        if (arr1.size() != arr2.size()) {
            System.out.println("Один массив больше другого.");
            return false;
        }
        System.out.println("Длины массивов совпадают.");

        for (int i = 0; i < arr1.size(); i++) {
            String type1 = arr1.get(i).getClass().getName();
            String type2 = arr2.get(i).getClass().getName();

            System.out.println(type1 + " <=> " + type2);

            if (!type1.equals(type2)) {
                return false;
            }
        }
        return true;
    }
}