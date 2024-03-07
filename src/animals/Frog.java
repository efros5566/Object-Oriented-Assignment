/**
 * Represents a Frog, a specific type of animal.
 * Extends the Animal class and implements both the Land and Water interfaces.
 */
package animal;

import interfaces.Land;
import interfaces.Water;

public class Frog extends Animal implements Land, Water {

    /**
     * Constructs a Frog with the specified mood.
     * mood The initial mood of the frog.
     */
    public Frog(int mood) {
        super(false, false, mood);
    }

    /**
     * Overrides the method to provide frog-specific greetings based on mood.
     * The mood in which the frog should say hello.
     */
    @Override
    public void sayHello(int mood) {
        this.setMood(mood);
        if (this.mood > 1 || this.mood < 0) {
            this.sayHello();
            return;
        }
        if (mood == MOODS.MOOD_HAPPY.ordinal())
            System.out.println("Happy voice: quack quack quack.");
        else
            System.out.println("Scared voice: Frog plops into the water.");
    }

    /**
     *
     * Indicates if the frog has gills.
     * return true, as frogs have gills.
     */
    @Override
    public final boolean hasGills() {
        return true;
    }

    /**
     * Indicates if the frog lays eggs.
     * return true, as frogs lay eggs.
     */
    @Override
    public final boolean hasLaysEggs() {
        return true;
    }

    /**
     * Gets the number of legs of the frog (always 4).
     * return The number of legs (4 for frogs).
     */
    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
