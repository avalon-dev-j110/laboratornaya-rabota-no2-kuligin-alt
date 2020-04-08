
package ru.avalon.java.dev.j10.labs.shapes;


public class PointImp1 implements Point {
    
    private float x;
    private float y;

    public PointImp1(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    
    

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PointImp1{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
