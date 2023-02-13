import java.security.spec.RSAOtherPrimeInfo;

public class Seasons {

    //Поля класса
    public season favoriteSeason = season.summer;

    //Перечисление времен года
    enum season{
        winter(-15),
        spring(10),
        summer(20){
            public String getDescription() {
                return "Теплое время года";
            }
        },
        autumn(0);
        double middleTemp;

        //Конструктор перечисления
        season(double temp){
            this.middleTemp = temp;
        }

        //Метод getDescription
        public String getDescription() {
            return "Холодное время года";
        }
    }

    //Метод loveSeason
    public static void loveSeason(season time_season){
        switch (time_season) {
            case winter -> System.out.println("Я люблю зиму!");
            case spring -> System.out.println("Я люблю весну!");
            case summer -> System.out.println("Я люблю лето!");
            case autumn -> System.out.println("Я люблю осень!");
            default -> System.out.println("Таккого времени года нет");
        }
    }

    //Метод getEnum
    public void getEnum(){
        for (season ses : season.values()){
            System.out.println(ses);
            System.out.println(ses.middleTemp);
            System.out.println(ses.getDescription());
            System.out.println(" ");
        }
    }

}
