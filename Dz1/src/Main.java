import javax.crypto.SealedObject;

public class Main {
    public static void main(String[] args) {

        /*
        ЗАДАНИЕ №1
         */

        //Создаем  3 объекта класса Phone
        Phone phone1 = new Phone("8900553535", "IPhon xs", 120);
        Phone phone2 = new Phone("8900674624", "BLACKBARRY", 177);
        Phone phone3 = new Phone("8966734213", "Xiaomi 10 pro", 200);

        System.out.println("Объект 1: " + phone1.phone + " " + phone1.model + " " + phone1.weight);
        System.out.println("Объект 2: " + phone2.phone + " " + phone2.model + " " + phone2.weight);
        System.out.println("Объект 3: " + phone3.phone + " " + phone3.model + " " + phone3.weight);


        //Вывовы методов
        phone1.receiveCall("Мама МТС");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Бабушка Мегафон");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Ванек Амбала");
        System.out.println(phone3.GetNumber());

        //Вызовы перегруженного метода
        phone1.receiveCall("Мама МТС", "89005553535");
        phone2.receiveCall("Бабушка Мегафон", "8900674624");
        phone3.receiveCall("Ванек Амбала", "8966734213");

        //Метод sendMessage
        String[] nums = new String[] {"8900553535", "8900674624", "8966734213"};
        Phone.sendMessage(nums);
        System.out.println(" ");

        /*
        ЗАДАНИЕ №2
        */

        System.out.println("Задание 2");

        //Пустой объект класса Person
        Person noName = new Person();

        //Объект класса Person
        Person Vanyok = new Person("Булыгин Иван Дмитриевич", 17);

        //Методы класса Person
        Vanyok.move(Vanyok.fullName);
        Vanyok.talk(Vanyok.fullName);

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