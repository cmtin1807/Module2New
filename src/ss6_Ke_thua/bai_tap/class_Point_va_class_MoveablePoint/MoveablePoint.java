package ss6_Ke_thua.bai_tap.class_Point_va_class_MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint() {
        xSpeed = 0;
        ySpeed = 0;
    }
    public MoveablePoint(float x, float y) {
        xSpeed = x;
        ySpeed = y;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed (){
        return new float[] {xSpeed,ySpeed};
    }
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }

    public MoveablePoint move() {
        setX(getX() + xSpeed); // Cập nhật tọa độ x
        setY(getY() + ySpeed); // Cập nhật tọa độ y
        return this;
    }
}
