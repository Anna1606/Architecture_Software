package Cars;

import Interfaces.IGasStation;
import Interfaces.ISweepingStreet;

/** Класс Toyota с возможностью подметать улицы */
public class Toyota extends Car implements ISweepingStreet, IGasStation {

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

    @Override
    public void fueling(String fuelType) {
        this.fuelType = fuelType;
        // здесь будет код заправки машины
    }

    @Override
    public void cleaningWindshield() {
        // здесь будет код метода протирки лобового стекла
    }

    @Override
    public void cleaningLights() {
        // здесь будет код метода протирки фар
    }

    @Override
    public void cleaningMirrors() {
        // здесь будет код метода протирки зеркал
    }
}
