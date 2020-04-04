package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
    
    PointImp1 point1;
    PointImp1 point2;

    public Rectangle(PointImp1 point1, PointImp1 point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    

    @Override
    public float getPerimeter() {  // Возвращает периметр прямоугольника.
        return 0;
    }

    @Override
    public float getArea() {  // Возвращает площадь четырехугольника.
        
        // В данном расчете принимаеся что стороны прямоугольника параллельны
        // осям координат и переданные координаты являютя крайними точками диагонали.
        
        float a; 
        float b;
        
        a = (point2.getX() - point1.getX());
        b = (point2.getY() - point1.getY());
        
        
        return (a * b); //Возвращаю площадь прямоугольника.
    }
    
    

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Rectangle{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }

    
}
