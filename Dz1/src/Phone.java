public class Phone {

    //Поля класса
    String phone;
    String model;
    int weight;

    //Конструктор с 3 параметрами
    public Phone(String phoneNum, String modelNum, int pWeight){
        this(phoneNum, modelNum);
        weight = pWeight;
    }

    //Конструктор с 2 параметрами
    public Phone(String phoneNum, String modelNum){
        phone = phoneNum;
        model = modelNum;
    }

    //Пустой конструктор
    public Phone(){}

    //Метод GetNumber
    public String GetNumber(){
        return phone;
    }

    //Метод receiveCall
    public void receiveCall(String name){
        System.out.println("Вам звонит " + name);
    }

    //Перегруженный метод receiveCall
    public void receiveCall(String name, String phoneNumber){
        System.out.println("Вам звонит " + name + " c телефона " + phoneNumber);
    }

    //Метод sendMessage
    public static void sendMessage(String[] numbers){
        System.out.println("Вы отправили сообщения на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}
