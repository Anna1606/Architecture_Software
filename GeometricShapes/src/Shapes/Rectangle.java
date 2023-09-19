package Shapes;

import java.util.HashMap;
import java.util.Map;

/** Прямоугольник*/
public class Rectangle implements IShape {
    /** Ширина */
    private double width;
    /** Длина */
    private double height;

    /** Конструктор класса Rectangle
     *
     * @param width ширина
     * @param height длина
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /** Получить ширину прямоугольника */
    public double getWidth() {
        return width;
    }
    /** Получить длину прямоугольника */
    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return "прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public Map<String, String> getParameters() {
        return new HashMap<String, String>(Map.of(
                "Ширина", Double.toString(this.getWidth()),
                "Длина", Double.toString(this.getHeight())
        ));
    }
}
