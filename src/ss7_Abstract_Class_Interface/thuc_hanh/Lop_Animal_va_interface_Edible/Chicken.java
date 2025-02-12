package ss7_Abstract_Class_Interface.thuc_hanh.Lop_Animal_va_interface_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Chip-Chip";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
