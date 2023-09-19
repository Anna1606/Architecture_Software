package Shapes;

import java.util.Map;

/** Интерфейс для геометрических фигур */
public interface IShape {
    /** Получить площать фигуры */
    double getArea();
    /** Получить периметр фигуры */
    double getPerimeter();
    /** Название фигуры */
    String getName();
    /** Получить параметры фигуры*/
    Map<String, String> getParameters();
}
