import abstraction.Car;
import overloading.Calculator;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import abstraction.Suzuki;
import composition.CarModel;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void scoateSunet(Animal a) {
        a.scoateSunet();
    }
    public static void main(String[] args) {


        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // static polymorphism
        a1.scoateSunet();
        a2.scoateSunet();

        // dynamic dispatch
        scoateSunet(a1);
        scoateSunet(a2);

        Calculator calculator = new Calculator();
        System.out.println( calculator.aduna(1, 2));
        System.out.println( calculator.aduna(2, 3, 4));
        System.out.println( calculator.aduna(2.0, 1));



        Suzuki masina = new Suzuki();
        masina.accelerate();

        Car altaMasina = new Suzuki();
        altaMasina.accelerate();

        CarModel modelNou = new CarModel("Vitara", "red", 20000);
        System.out.println(modelNou.getName());
        modelNou.setName("logan");

    }


}
