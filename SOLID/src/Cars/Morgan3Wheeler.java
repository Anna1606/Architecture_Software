package Cars;

public class Morgan3Wheeler extends Car{

    /**
     * Конструктор класса Car
     *
     * @param brand         марка
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param fuelType      тип топлива
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     */
    public Morgan3Wheeler(String brand, String model, String exteriorColor, String bodyType, String fuelType, String gearboxType, int engine) {
        super(brand, model, exteriorColor, bodyType, 3, fuelType, gearboxType, engine);
    }
}
