package Task4;

import java.util.Scanner;

public class Task4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        processString();
    }

    public static void processString() {
        while (true) {
            try {
                System.out.print("Введите любую строку: ");
                String inputVal = scanner.nextLine();
                String res = validateInput(inputVal);
                System.out.printf("Введенная строка: %s\n", res);
                return;
            } catch (MyStringEmptyException e) {
                System.out.println("Нельзя вводить пустую строку. Попробуйте еще раз");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод проверяет строку на пустоту
     *
     * @param str Строка
     * @return Строка если не пуста
     * @throws MyStringEmptyException При вводе пустой строки
     */
    private static String validateInput(String str) throws MyStringEmptyException {
        if (str.isEmpty()) {
            throw new MyStringEmptyException();
        }
        return str;
    }
}
