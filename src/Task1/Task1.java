package Task1;

import java.util.Scanner;

public class Task1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        processFloat();
    }

    public static void processFloat() {
        while (true) {
            try {
                System.out.print("Введите дробное число (типа float): ");
                String inputVal = scanner.nextLine();
                float res = parseFloat(inputVal);
                System.out.printf("Введенное число: %.3f\n", res);
                return;
            } catch (MyFloatDataFormatException e) {
                System.out.printf("%s, введенная строка \"%s\"\n", e.getMessage(), e.getArg());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод преобразования строки в дробное число
     *
     * @param str Строка
     * @return Дробное число
     * @throws MyFloatDataFormatException Некорректный формат данных
     */
    private static float parseFloat(String str) throws MyFloatDataFormatException {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            throw new MyFloatDataFormatException("Некорректный формат данных", str);
        }
    }
}
