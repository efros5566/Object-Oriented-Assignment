/**
 * Represents a Frog, a specific type of animal.
 * Extends the Animal class and implements both the Land and Water interfaces.
 */
package animal;

import interfaces.Land;
import interfaces.Water;
import lombok.Getter;
import lombok.Setter;

/**
 * Concrete class representing a Frog.
 */
@Getter
@Setter
public class Frog extends Animal implements Land, Water {

    /**
     * Constructs a Frog with the specified mood.
     *
     * @param mood The initial mood of the frog.
     */
    public Frog(int mood) {
        super(false, false, mood);
    }

    /**
     * {@inheritDoc}
     * Overrides the method to provide frog-specific greetings based on mood.
     *
     * @param mood The mood in which the frog should say hello.
     */
    @Override
    public void sayHello(int mood) {
        this.setMood(mood);
        if (this.mood > 2 || this.mood < 0) {
            this.sayHello();
            return;
        }
        if (mood == Animal.MOOD_HAPPY)
            System.out.println("Happy voice: quack quack quack.");
        else if (mood == Animal.MOOD_SCARE)
            System.out.println("Scared voice: Frog plops into the water.");
    }

    /**
     * {@inheritDoc}
     * Indicates if the frog has gills.
     *
     * @return true, as frogs have gills.
     */
    @Override
    public final boolean hasGills() {
        return true;
    }

    /**
     * {@inheritDoc}
     * Indicates if the frog lays eggs.
     *
     * @return true, as frogs lay eggs.
     */
    @Override
    public final boolean hasLaysEggs() {
        return true;
    }

    /**
     * {@inheritDoc}
     * Gets the number of legs of the frog (always 4).
     *
     * @return The number of legs (4 for frogs).
     */
    @Override
    public int getNumberOfLegs() {
        return 4;
    }
}
