package lesson1Advanced;

/* Мое имя
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "*";
        int i =0;
        int j =0;
        int k =0;

        for (i = 9; i >=0; i--){

            for(j = 0; j < i; j++){
                System.out.print(' ');
            }
            for(k = j; k < 10; k++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}