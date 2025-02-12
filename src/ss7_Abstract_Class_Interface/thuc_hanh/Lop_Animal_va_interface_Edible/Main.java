package ss7_Abstract_Class_Interface.thuc_hanh.Lop_Animal_va_interface_Edible;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }
        }
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
