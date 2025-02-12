package ss6_Ke_thua.bai_tap.class_Point_va_class_MoveablePoint;

public class Point {
    private float x;
    private float y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY(){
        return new float[] {x, y};
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
