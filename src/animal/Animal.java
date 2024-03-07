/**
 * The {@code Animal} class represents a generic animal with basic attributes and behaviors.
 * It is an abstract class that provides a foundation for specific types of animals.
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-03-07
 */
package animal;

import interfaces.Land;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

/**
 * The {@code Animal} class is an abstract class representing a generic animal.
 */
@Getter
@Setter
public abstract class Animal {

    /**
     * Indicates whether the animal is a mammal.
     */
    protected boolean mammals;

    /**
     * Indicates whether the animal is carnivorous.
     */
    protected boolean carnivorous;

    /**
     * Constant representing a happy mood.
     */
    public static final int MOOD_HAPPY = 1;

    /**
     * Constant representing a scared mood.
     */
    public static final int MOOD_SCARE = 2;

    /**
     * Represents the current mood of the animal.
     */
    protected int mood;

    /**
     * Constructs an animal with the specified attributes.
     *
     * @param mammals     true if the animal is a mammal, false otherwise
     * @param carnivorous true if the animal is carnivorous, false otherwise
     * @param mood        the initial mood of the animal
     */
    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    /**
     * Prints a generic greeting message from the animal.
     */
    public void sayHello() {
        System.out.println("Animal says: Hello!");
    }

    /**
     * Abstract method for the animal to say hello based on its mood.
     *
     * @param mood the mood in which the animal should say hello
     */
    public abstract void sayHello(int mood);

    /**
     * Checks if the animal is a mammal.
     *
     * @return true if the animal is a mammal, false otherwise
     */
    public boolean isMammals() {
        return mammals;
    }

    /**
     * Checks if the animal is carnivorous.
     *
     * @return true if the animal is carnivorous, false otherwise
     */
    public boolean isCarnivorous() {
        return carnivorous;
    }

    /**
     * Translates the numeric mood value into a corresponding mood string.
     *
     * @param mood the numeric representation of the mood
     * @return a string representing the mood (Happy, Scared, or Normal)
     */
    public String translateMoods(int mood) {
        if (mood == MOOD_HAPPY) {
            return "Happy";
        } else if (mood == MOOD_SCARE) {
            return "Scared";
        } else {
            return "Normal";
        }
    }
}
