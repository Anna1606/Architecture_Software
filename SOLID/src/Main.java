import Cars.*;


public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Karcher", "black", "bunker", 4, "Manual", 1.5);
        Morgan3Wheeler sportCar = new Morgan3Wheeler("Wheeler", "3", "blu", "cabriolet", "Manual", 2);

        // проверка возможности подметать улицы
        toyota.sweepingTheStreet();

        // проверка возможности перевозки грузов
        toyota.shipping();

        // проверка возможности включения противотуманных фар
        toyota.fogLampsON();

        // проверка возможностей класса на соответствие принципу LSP
        sportCar.service();
        sportCar.drive(sportCar.getFuelType());
        sportCar.fogLampsON();
        sportCar.onHeadlights();
        sportCar.shifting();
        sportCar.shipping();
        sportCar.onWipers();

        // проверка LSP при изменении метода движения
        FlyMobil flyMobil = new FlyMobil("Saab","fly","black","fluselage",4,"diesel","Manual",2 , "постоянная хорда");
        // подставить в базовый класс невозможно
        // Car flyMobil = new FlyMobil("Saab","fly","black","fluselage",4,"diesel","Manual",2 , "постоянная хорда");
        toyota.drive(toyota.getFuelType());
        flyMobil.drive(flyMobil.getFuelType());

        // проверка принципа DIP
        toyota.fueling();
        sportCar.fueling();
    }
}