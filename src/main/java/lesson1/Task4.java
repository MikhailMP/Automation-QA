package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Vladimir";
        int i =0;
        int j =0;
        do {
            j = 0;
            i++;
            do{
                System.out.print(s + " ");
                j++;
            } while(j < 10);
            System.out.println();
        } while(i < 5);


    }
}