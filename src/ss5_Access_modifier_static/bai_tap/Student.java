package ss5_Access_modifier_static.bai_tap;

public class Student {
    public String name = "Nguyen";
    public String classes = "C04";
    public Student (){}
    public void setName (String name){
        this.name = name;
    }
    public void setClasses (String classes){
        this.classes = classes;
    }
    public String toString (){
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
    public static void main (String [] args){
        Student s = new Student();
        s.setName("Nguyen");
        s.setClasses("C06");
        System.out.println(s.toString ());
    }

}
