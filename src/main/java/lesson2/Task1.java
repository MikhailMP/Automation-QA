package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {
    private int age = 1;
    private String name;
    private String ageGroup;
/////////////////////////////////////////////////////////////////// Getter
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getageGroup(){
        return ageGroup;
    }
/////////////////////////////////////////////////////////////////////// Setter Age
    public void setAge(int age){
        if(age > 0 && age < 100){
            this.age = age;
            if(age >= 1 && age < 15){
                setAgeGroup("child");
            }
            else if(age >= 15 && age <= 25){
                setAgeGroup("student");
            }
            else if(age > 26 && age <= 65){
                setAgeGroup("worker");
            }
            else if(age >= 66){
                setAgeGroup("pensioner");
            }
        }
        else{
            System.out.println("Incorrect age. Age must be from 1 to 100 years ");
            setAgeGroup("Age group is undefined");
        }
    }
    //////////////////////////////////////////////////////////////////////////// Setter Name

    public void setName(String name){
        if(name == null || name.isEmpty() || name.isBlank()){
            this.name = "Name is empty or contain only space symbols";
            System.out.println("Incorrect name. Name could not be empty");
        }

        else if(name.length() < 3 || name.length() > 50){
            this.name = "Incorrect name";
            System.out.println("Incorrect name. Name must be from 3 to 50 symbols ");
        }
        else if(name.length() >= 3 && name.length() <= 50){

            if (name.substring(0,1).isBlank()) {
                if(name.substring(1,2).isBlank()){
                    this.name = name.substring(2,3).toUpperCase();
                }
                else{
                    this.name = name.substring(1,2).toUpperCase();
                }
            }
            else{
                this.name = name.substring(0,1).toUpperCase();
            }
        }
        else{
            this.name = "Name is NULL";
            System.out.println("Incorrect name. Name could not be NULL");

        }
    }
    //////////////////////////////////////////////////////////////////////////// Setter ageGroup
    private void setAgeGroup(String ageGroup){
        this.ageGroup = ageGroup;
    }

}
