package Cars;

// такое наследование нарушает принцип LSP
public class FlyMobil extends Car {
    private String wings;
    /**
     * Конструктор класса FlyMobil
     *
     * @param brand         марка
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param wheelsCount   число колес
     * @param fuelType      тип топлива
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     * @param wings         тип крыльев
     */
    public FlyMobil(String brand, String model, String exteriorColor, String bodyType, int wheelsCount, String fuelType, String gearboxType, double engine, String wings) {
        super(brand, model, exteriorColor, bodyType, wheelsCount, fuelType, gearboxType, engine);
        this.wings = wings;
    }

    @Override
    public void drive(String gearboxType) {
        System.out.println("Эта машина умеет летать, но не умеет ехать");
    }
    public void fly() {
        System.out.println("Start flying");
    }
}
