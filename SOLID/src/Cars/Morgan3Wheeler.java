package Cars;

import Interfaces.IGasStation;

public class Morgan3Wheeler extends Car implements IGasStation {


    /**
     * Конструктор класса Morgan3Wheeler c бензиновым двигателем
     *
     * @param brand         марка
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     */
    public Morgan3Wheeler(String brand, String model, String exteriorColor, String bodyType, String gearboxType, double engine) {
        super(brand, model, exteriorColor, bodyType, 3, "petrol", gearboxType, engine);
    }

    @Override
    public void fueling() {
        System.out.println("заправка бензиновым топливом");
    }
}
