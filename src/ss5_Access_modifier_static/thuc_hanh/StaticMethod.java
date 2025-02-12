package ss5_Access_modifier_static.thuc_hanh;

public class StaticMethod {
    private String name;
    private int age;
    private static String color = "Black";
    public StaticMethod() {}
    public StaticMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void changeColor(String newColor) {
        color = newColor;
    }
    public static void staticChangeColor() {
        color = "Dep trai";
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Color: " + color;
    }
    public static void main(String[] args) {
        StaticMethod.staticChangeColor();
        StaticMethod student = new StaticMethod("Nguyen",28);
        System.out.println(student.toString());
        StaticMethod student2 = new StaticMethod("Nguyen",29);
        student2.staticChangeColor();
        System.out.println(student2.toString());
    }


}
