package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {
    
    PointImp1 point1;
    PointImp1 point2;

    public Circle(PointImp1 point1, PointImp1 point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    
    @Override
    public float getLength() {  // Возвращает длину окружности.
        return 0;
    }

    @Override
    public float getArea() {  // Возвращает площадь круга.
        
        float r;  // Радиус окружности.
        
        // Вычисляю радиус окружности через теорему Пифагора, по полученным
        // координатам где радиус "r" является гипотенузой прямоугольного треугольника, 
        // а стороны "а" и "b" - его катетами.
        
        float a;  
        float b;
        
        a = (point2.getX() - point1.getX());
        b = (point2.getY() - point1.getY());
        
        r = (float) Math.sqrt((a * a) + (b * b));
        
        return (float) (3.14 * (r * r));  // Возвращаю площадь круга.
    }
    
    

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Circle{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }

    
}
