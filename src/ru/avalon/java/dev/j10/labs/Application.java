package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {

    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[10];
        
        
        
        shapes[0] = new Circle(new PointImp1(5, 4), new PointImp1(8, 6));
        shapes[1] = new Rectangle(new PointImp1(6, 4), new PointImp1(11, 8));
        shapes[2] = new Triangle(new PointImp1(0, 0), new PointImp1(1000, 0), new PointImp1(500, 2000));
        shapes[3] = new Rectangle(new PointImp1(1, 1), new PointImp1(10, 6));
        shapes[4] = new Rectangle(new PointImp1(0, 0), new PointImp1(11, 5));
        shapes[5] = new Circle(new PointImp1(3, 5), new PointImp1(11, 12));
        shapes[6] = new Triangle(new PointImp1(5, 7), new PointImp1(10, 7), new PointImp1(8, 13));
        shapes[7] = new Triangle(new PointImp1(4, 4), new PointImp1(7, 5), new PointImp1(6, 9));
        shapes[8] = new Circle(new PointImp1(3, 3), new PointImp1(9, 5));
        shapes[9] = new Circle(new PointImp1(0, 0), new PointImp1(10, 10));
        
        Shape beatShape = maxArea(shapes);
        
        System.out.println(beatShape.toString());

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
    
    private static Shape maxArea(Shape[] shapes) {
        if(shapes.length == 0) {
            return null;
        }
        
        Shape result = shapes[0];
        
        for (int i = 1; i < shapes.length; i++) {
            if(result.getArea() < shapes[i].getArea()) {
                result = shapes[i];
            }
        }
        
        return result;
    }
}
