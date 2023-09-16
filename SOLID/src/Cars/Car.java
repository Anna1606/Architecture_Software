package Cars;

/**
 * абстрактный класс «Car» у которого должны быть свойства:
 * марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
 * методы:
 * движение, обслуживание, переключение передач, включение фар, включение дворников
 */

public abstract class Car {
    /**
     * марка машины
     */
    protected String brand;
    /**
     * модель машины
     */
    protected String model;
    /**
     * цвет кузова
     */
    protected String exteriorColor;
    /**
     * тип кузова
     */
    protected String bodyType;
    /**
     * число колёс
     */
    protected int wheelsCount;
    /**
     * тип топлива
     */
    protected String fuelType;
    /**
     * тип коробки передач
     */
    protected String gearboxType;
    /**
     * объём двигателя
     */
    protected double engine;

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
    public Car(String brand, String model, String exteriorColor,
               String bodyType, int wheelsCount, String fuelType,
               String gearboxType, double engine) {
        this.brand = brand;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.bodyType = bodyType;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.engine = engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    /**
     * Приведение машины в движение
     *
     * @param gearboxType тип коробки передач
     */
    public void drive(String gearboxType) {
        System.out.println("Car is driving on the road");
    }

    public void service() {
        // здесь какой-то способ обслуживания автомобиля
        System.out.println("отправить машину в сервис");
    }

    public void shifting() {
        // здесь способ переключения передач автомобиля
        System.out.println("переключить передачу");
    }

    public void onHeadlights() {
        // здесь способ включения фар
        System.out.println("включить фары");
    }

    public void onWipers() {
        // здесь способ включения дворников
        System.out.println("включить дворники");
    }

    public void shipping() {
        // Возможность перевозки грузов
        System.out.println("Возможность перевозки грузов");
    }
    public void fogLampsON() {
        //  Возможность включения противотуманных фар
        System.out.println("Возможность включения противотуманных фар");
    }
}
