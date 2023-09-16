package Cars;

import Interfaces.*;

/**
 * Класс Toyota с возможностью подметать улицы
 */
public class Toyota extends Car implements ISweepingStreet, IGasStation, ICleaningLights, ICleaningMirrors, ICleaningWindshield {

    /**
     * Конструктор класса Toyota
     *
     * @param model         модель
     * @param exteriorColor цвет кузова
     * @param bodyType      тип кузова
     * @param wheelsCount   число колес
     * @param gearboxType   тип коробки передач
     * @param engine        объем двигателя
     */
    public Toyota(String model, String exteriorColor, String bodyType, int wheelsCount, String gearboxType, double engine) {
        super("Toyota", model, exteriorColor, bodyType, wheelsCount, "diesel", gearboxType, engine);
    }

    @Override
    public void sweepingTheStreet() {
        // подметать улицы
        System.out.println("начать уборку");
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

    @Override
    public void fueling() {
        System.out.println("заправка дизельным топливом");
    }
}
