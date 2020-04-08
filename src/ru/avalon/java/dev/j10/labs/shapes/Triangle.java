package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
    
    PointImp1 point1;
    PointImp1 point2;
    PointImp1 point3;

    public Triangle(PointImp1 point1, PointImp1 point2, PointImp1 point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    

    @Override
    public float getPerimeter() {  // Периметр треугольника.
        return 0;
    }

    @Override
    public float getArea() {  // Площадь треугольника.
        
        // Нахожу стороны "а", "b" и "с" треугольника по полученным координатам:
        
        float a; // Сторона "а" треугольника.
        float b; // Сторона "b" треугольника.
        float c; // Сторона "c" треугольника.
        
        
        float d;  // Вспомогательные катеты для нахождения сторон
        float e;  // треугольника по заданным координатам с помощью теоремы Пифагора.
        
        d = (point2.getX() - point1.getX());
        e = (point2.getY() - point1.getY());
        
        a = (float) Math.sqrt((d * d) + (e * e)); // Сторона "а" треугольника.
        
        
        d = (point2.getX() - point3.getX());
        e = (point3.getY() - point2.getY());
        
        b = (float) Math.sqrt((d * d) + (e * e)); // Сторона "b" треугольника.
        
        
        d = (point3.getX() - point1.getX());
        e = (point3.getY() - point1.getY());
        
        c = (float) Math.sqrt((d * d) + (e * e)); // Сторона "c" треугольника.
        
        float p = ((a + b + c) / 2);  // Полупериметр треугольника (необходим для вычисления площади треугольника).
        
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));   // Возврат площади треугольника.
    }
    
    

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Triangle{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + '}';
    }

    
}
