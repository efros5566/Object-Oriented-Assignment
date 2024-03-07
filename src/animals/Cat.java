/**
 * Represents a Cat, a specific type of animal.
 * Extends the Animal class and implements the Land interface.
 */
package animal;

import interfaces.Land;

public class Cat extends Animal implements Land {

    /**
     * Constructs a Cat with the specified mood.
     *  mood The initial mood of the cat.
     */
    public Cat(int mood) {
        super(true, true, mood);
    }

    /**
     * Prints a typical greeting behavior of cats - meowing.
     */
    @Override
    public void sayHello() {
        System.out.println("Normally, cats say: meow.");
    }

    /**
     *
     * Overrides the method to provide cat-specific greetings based on mood.
     *
     * The mood in which the cat should say hello.
     */
    @Override
    public void sayHello(int mood) {
        this.setMood(mood);
        if (mood > 1 || mood < 0) {
            this.sayHello();
            return;
        }
        if (mood == MOODS.MOOD_HAPPY.ordinal()) {
            System.out.println("Happy voice: purr, purr.");
        } else {
            System.out.println("Scared voice: hiss.");
        }
    }

    /**
     *
     * Gets the number of legs of the cat (always 4).
     * The number of legs (4 for cats).
     */
    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
