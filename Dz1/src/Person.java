public class Person {

    //Поля класса
    String fullName;
    int age;

    //Пустой конструктор
    public Person(){}

    //Конструктор
    public Person(String FIO, int age_person){
        fullName = FIO;
        age = age_person;
    }

    //Метод Move
    public void move(String name){
        System.out.println(name + " идет");
    }

    //Метод Talk
    public void talk(String name){
        System.out.println(name + " говорит");
    }
}
