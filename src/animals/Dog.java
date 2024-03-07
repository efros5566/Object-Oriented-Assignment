/**
 * Represents a Dog, a specific type of animal.
 * Extends the Animal class and implements the Land interface.
 */
package animal;

import interfaces.Land;

public class Dog extends Animal implements Land {

    /**
     * Constructs a Dog with the specified mood.
     * param mood The initial mood of the dog.
     */
    public Dog(int mood) {
        super(true, true, mood);
    }

    /**
     * Prints a typical greeting behavior of dogs - wagging their tails.
     */
    @Override
    public void sayHello() {
        System.out.println("Normally, dogs wag their tails.");
    }

    /**
     * Overrides the method to provide dog-specific greetings based on mood.
     * param mood The mood in which the dog should say hello.
     */
    @Override
    public void sayHello(int mood) {
        this.setMood(mood);
        if (mood > 1 || mood < 0) {
            this.sayHello();
            return;
        }
        if (mood == MOODS.MOOD_HAPPY.ordinal()) {
            System.out.println("Happy voice: bark loudly.");
        } else {
            System.out.println("Scared voice: whooping.");
        }
    }

    /**
     * Gets the number of legs of the dog (always 4).
     * return The number of legs (4 for dogs).
     */
    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
