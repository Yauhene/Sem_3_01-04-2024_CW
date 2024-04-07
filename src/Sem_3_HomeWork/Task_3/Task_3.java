package Sem_3_HomeWork.Task_3;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
типа.
 */

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {

        Integer[] array_1 = {1, 2, 3, 4, 5};
        Integer[] array_2 = {1, 2, 3, 4, 5};
        Integer[] array_3 = {1, 2, 3, 4};
        Integer[] array_4 = {1, 2, 7, 4, 5};

        Double[] array_1d = {1.0, 2.5, 3.3, 4.0, 5.0};
        Double[] array_2d = {1.0, 2.5, 3.3, 4.0, 5.0};
        Double[] array_3d = {1.0, 2.5, 3.3, 5.0};
        Double[] array_4d = {1.0, 7.5, 3.3, 4.0, 5.0};

        MyArray<Integer> array_5 = new MyArray<>(new Integer[]{1, 2, 3, 4, 5});
        MyArray<Integer> array_6 = new MyArray<>(new Integer[]{1, 2, 3, 4, 5});
        MyArray<Integer> array_7 = new MyArray<>(new Integer[]{1, 2, 3, 4});
        MyArray<Integer> array_8 = new MyArray<>(new Integer[]{1, 2, 7, 4, 5});

        System.out.println(compareArrays(array_1, array_2));
        System.out.println(compareArrays(array_1, array_3));
        System.out.println(compareArrays(array_1, array_4));

        System.out.println(compareArrays(array_1d, array_2));
        System.out.println(compareArrays(array_1d, array_2d));
        System.out.println(compareArrays(array_1d, array_3d));
        System.out.println(compareArrays(array_1d, array_4d));

        System.out.println(compareArrays(array_5.getValue(), array_6.getValue()));

    }

    public static <T extends Number> boolean compareArrays(T[] arr1 , T[] arr2) {
        boolean result = true;
        boolean more = true;
        System.out.println("-".repeat(45));
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        if (arr1.length != arr2.length) {
            System.out.println("Массивы отличаются по размеру, размер первого " + arr1.length + " , второго " + arr2.length);
            result = false;
            more = false;
        }
        if ( more && !arr1.getClass().getSimpleName().equals(arr2.getClass().getSimpleName())) {
            System.out.println("Несовпадение типов данных: " + arr1.getClass().getSimpleName() + " и " + arr2.getClass().getSimpleName());
            result = false;
            more = false;

        }
        if (more) {
            for (int i = 0; i < arr1.length; i++) {
                if (!Objects.equals(arr1[i], arr2[i])) {
                    System.out.println("Несовпадение элементов со значениями " + arr1[i] + " и " + arr2[i] + ", индекс " + i);
                    result = false;
                }
            }
        }
        return result;
    }
}
