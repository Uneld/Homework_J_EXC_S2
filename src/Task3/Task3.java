package Task3;

public class Task3 {
    // throws Exception убираем проброс исключения т.к. пробрасывать его из main в никуда ну это уже слишком
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 1;
            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        // можно добавить для проверки деления на 0
        catch (ArithmeticException ex) {
            System.out.println("Деление на 0");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        // переносим суперкласс для исключений и ошибок ниже после всех типов для того чтобы работали определенные выше
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // throws FileNotFoundException заменяем на NullPointerException
    // т.к. может быть передан null в метод и возникнет ошибка
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}
