package Shapes;

import java.util.HashMap;
import java.util.Map;
/** Треугольник */
public class Triangle implements IShape{
    /** Сторона 1 */
    private double a;
    /** Сторона 2 */
    private double b;
    /** Сторона 3 */
    private double c;

    /** Конструктор класса Triangle
     *
     * @param a стороно 1
     * @param b сторона 2
     * @param c сторона 3
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /** Получить сторону 1 */
    public double getA() {
        return a;
    }
    /** Получить сторону 2 */
    public double getB() {
        return b;
    }
    /** Получить сторону 3 */
    public double getC() {
        return c;
    }

    @Override
    public String getName() {
        return "треугольник";
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Стороны", this.getA() + ", " + this.getB() + ", " + this.getC()
        ));
    }
}
