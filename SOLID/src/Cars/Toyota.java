package Cars;
/** Класс Toyota с возможностью подметать улицы */
public class Toyota extends Car implements ISweepingStreet{

    /**
     * Конструктор класса Toyota
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param wheelsCount   число колес
     * @param fuelType      тип топлива
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     */
    public Toyota(String model, String exteriorColor, String bodyType, int wheelsCount, String fuelType, String gearboxType, int engine) {
        super("Toyota", model, exteriorColor, bodyType, wheelsCount, fuelType, gearboxType, engine);
    }

    @Override
    public void sweepingTheStreet() {
        // подметать улицы
    }
}
