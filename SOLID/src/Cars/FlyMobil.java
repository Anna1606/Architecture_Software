package Cars;
// такое наследование нарушает принцип LSP
public class FlyMobil extends Car{

    /**
     * Конструктор класса Car
     *
     * @param brand         марка
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param wheelsCount   число колес
     * @param fuelType      тип топлива
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     */
    public FlyMobil(String brand, String model, String exteriorColor, String bodyType, int wheelsCount, String fuelType, String gearboxType, int engine) {
        super(brand, model, exteriorColor, bodyType, wheelsCount, fuelType, gearboxType, engine);
    }

    @Override
    protected void drive(String gearboxType) {
        this.gearboxType = gearboxType;
        System.out.println("Эта машина умеет летать, но не умеет ехать");
    }
}
