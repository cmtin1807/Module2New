package ss7_Abstract_Class_Interface.thuc_hanh.trien_khai_interface_Comparable;

public class Square extends Rectangle {
    public Square (){    }
    public Square (double side){
        super(side,side);
    }
    public Square (double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide (){
        return super.getWidth();
    }
    public void setSide (double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}
