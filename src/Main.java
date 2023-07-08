
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача № 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача № 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача № 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является высокостным ");
        }
        System.out.println("Задача № 6");
        for (int i = 7; i <= 77; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача № 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача № 8");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println("Задача № 9");
        int salary1 = 29_000;
        int total1 = 0;

        for (int i = 1; i <= 12; i++) {
            total1 = salary1 / 100 * 12;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("Задача № 10");
        int number = 2;
        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = res + number;

            System.out.println(number + "*" + i + "=" + res);
        }
    }
}









