package ss6_Ke_thua.bai_tap.class_Point2D_va_class_Point3D;

public class Point3D extends Point2D{
    private float z;
    public Point3D() {
        z = 2.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float [] getXYZ(){
        return new float[]{getX(), getY(), getZ()};
    }
    public String toString(){
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";

    }
}
