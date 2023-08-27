package Task2;

import java.lang.reflect.Array;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        task2(arr1);
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        task2(arr2);
    }

    public static void task2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { //добавляем проверку на выход за пределы массива
            System.out.println("Catching exception: " + e);
        } catch (Exception e) { // и на все остальное
            e.printStackTrace();
        }
    }
}
