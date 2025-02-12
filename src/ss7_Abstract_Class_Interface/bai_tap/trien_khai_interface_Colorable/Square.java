package ss7_Abstract_Class_Interface.bai_tap.trien_khai_interface_Colorable;

public class Square extends Rectangle implements Colorable {
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

    @Override
    public void howToColor() {
        System.out.println("Color all four");
    }
}
