import animal.*;

public class TestAnimal {
    public static void main(String[] args) {



        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("----Dog Class----");
        Dog dog = new Dog(5);
        dog.sayHello();
        dog.sayHello(Animal.MOOD_SCARE);
        System.out.println("Mood value: " + dog.getMood()+" the intent:"+ dog.translateMoods(dog.getMood()));
        System.out.println("how many legs do you have?"+ dog.getNumberOfLegs());

        System.out.println("----Cat Class----");
        Cat cat = new Cat(Animal.MOOD_SCARE);
        cat.sayHello();
        cat.sayHello(Animal.MOOD_HAPPY);
        System.out.println("Mood value: " + cat.getMood()+" the intent:"+ cat.translateMoods(cat.getMood()));
        System.out.println("how many legs do you have?"+ cat.getNumberOfLegs());


        System.out.println("----Frog Class----");
        Frog frog = new Frog( 2);
        frog.sayHello();
        frog.sayHello(Animal.MOOD_SCARE);
        System.out.println("Mood value: " +frog.getMood()+" the intent:"+ frog.translateMoods(frog.getMood()));
        System.out.println("how many legs do you have?"+ frog.getNumberOfLegs());
        System.out.println("the frog has a gills?"+frog.hasGills());
        System.out.println("the frog has lay eggs?"+ frog.hasLaysEggs());
        System.out.println("-------------------------------------------------------------------------------");
            }
        }
