package lesson1Advanced;

/*
Семантическое версионирование
Реализовать метод который принимает на вход две строки
с версиями программы ("1.0.1.2", "1.1.1.2")
и возвращает версию более ранней
Подсказка - для решения строки надо разбить на массивы
Про семантическое версионирование почитать можно здесь https://semver.org/lang/ru/
*/

public class Task4 {

    public static void main(String[] args) {
        String lovestVersion = minVersion("1.12.0.1.2", "1.10.100.2.2");
        System.out.println(lovestVersion);
    }

    public static String minVersion(String v1, String v2) {

        String[] array1 = v1.split("\\.");
        String[] array2 = v2.split("\\.");

        for(int i = 0; i < array1.length; i++){

            String element1 = array1[i];
            int num1 = Integer.parseInt(element1);

            String element2 = array2[i];
            int num2 = Integer.parseInt(element2);

            if (num1 > num2) {
                return v2;
            }

        }
        return v1;
    }
}