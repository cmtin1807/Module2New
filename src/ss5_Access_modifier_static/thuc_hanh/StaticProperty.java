package ss5_Access_modifier_static.thuc_hanh;

public class StaticProperty {
    private String name;
    private int age;
    private static int numberStudent;
    public StaticProperty(String name, int age) {
        this.name = name;
        this.age = age;
        numberStudent++;
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

    public static int getNumberStudent() {
        return numberStudent;
    }

    public static void setNumberStudent(int numberStudent) {
        StaticProperty.numberStudent = numberStudent;
    }
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", NumberStudent: " + numberStudent;
    }
    public static void main(String[] args) {
        StaticProperty st = new StaticProperty("John Smith", 25);
        StaticProperty st1 = new StaticProperty("John Smith", 25);
        System.out.println(st1);
        StaticProperty st2 = new StaticProperty("John Smith", 27);
        System.out.println(st2);
        System.out.println(st.equals(st1));
        StaticProperty st3 = st;
        System.out.println(st3.equals(st));
        st3.age = 27;
        System.out.println(st);
        System.out.println(st3);

    }
}
