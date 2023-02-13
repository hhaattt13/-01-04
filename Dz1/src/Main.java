import javax.crypto.SealedObject;

public class Main {
    public static void main(String[] args) {

        /*
        ЗАДАНИЕ №1
         */

        //Создаем  3 объекта класса Phone
        Phone phone1 = new Phone("89001233456", "IPhon 5s", 120);
        Phone phone2 = new Phone("89056783478", "Huawei 10 pro", 177);
        Phone phone3 = new Phone("89607801238", "Xiaomi 9 pro max", 200);

        System.out.println("Объект 1: " + phone1.phone + " " + phone1.model + " " + phone1.weight);
        System.out.println("Объект 2: " + phone2.phone + " " + phone2.model + " " + phone2.weight);
        System.out.println("Объект 3: " + phone3.phone + " " + phone3.model + " " + phone3.weight);


        //Вывовы методов
        phone1.receiveCall("Мама Tele2");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Бабушка билайн");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Тема бутер мен");
        System.out.println(phone3.GetNumber());

        //Вызовы перегруженного метода
        phone1.receiveCall("Мама Tele2", "89001233456");
        phone2.receiveCall("Бабушка билайн", "89056783478");
        phone3.receiveCall("Тема бутер мен", "89607801238");

        //Метод sendMessage
        String[] nums = new String[] {"89001233456", "89056783478", "89607801238"};
        Phone.sendMessage(nums);
        System.out.println(" ");

        /*
        ЗАДАНИЕ №2
        */

        System.out.println("Задание 2");

        //Пустой объект класса Person
        Person noName = new Person();

        //Объект класса Person
        Person Nikita = new Person("Метлов Никита Михайлович", 17);

        //Методы класса Person
        Nikita.move(Nikita.fullName);
        Nikita.talk(Nikita.fullName);

        /*
        ЗАДАНИЕ №3
        */

        //Создание экземпляра класса Seasons
        Seasons mySeason = new Seasons();

        //Вывод любимого времени года
        System.out.println("мое любимое время года: " + mySeason.favoriteSeason + ", это " + mySeason.favoriteSeason.getDescription() + " со средней температурой - " + mySeason.favoriteSeason.middleTemp);
        Seasons.loveSeason(Seasons.season.summer);

        //Вывод всех времен года
        mySeason.getEnum();
    }
}