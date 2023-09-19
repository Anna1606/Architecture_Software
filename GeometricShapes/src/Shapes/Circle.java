package Shapes;

import java.util.HashMap;
import java.util.Map;
/** Круг */
public class Circle implements IShape {
    /** Радиус */
    private double radius;

    /** Конструктор класса Circle
     *
     * @param radius радиус
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /** Получить радуис */
    public double getRadius() {
        return radius;
    }
    /** Задать радиус */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String getName() {
        return "круг";
    }
    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Радиус", Double.toString(this.getRadius())
        ));
    }
}
