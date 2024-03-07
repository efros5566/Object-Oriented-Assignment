/**
 * The Animal class represents a generic animal with basic attributes and behaviors.
 * It is an abstract class that provides a foundation for specific types of animals.
 */
package animal;

import interfaces.Land;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;


/**
 * The class is an abstract class representing a generic animal.
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
     * Represents the current mood of the animal.
     */
    protected int mood;

    /**
     * Constructs an animal with the specified attributes.
     * param mammals     true if the animal is a mammal, false otherwise
     * param carnivorous true if the animal is carnivorous, false otherwise
     * param mood        the initial mood of the animal
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
     * the mood in which the animal should say hello
     */
    public abstract void sayHello(int mood);

    /**
     * Checks if the animal is a mammal.
     * return true if the animal is a mammal, false otherwise
     */
    public boolean isMammals() {
        return mammals;
    }

    /**
     * Checks if the animal is carnivorous.
     * return true if the animal is carnivorous, false otherwise
     */
    public boolean isCarnivorous() {
        return carnivorous;
    }

    /**
     * Translates the numeric mood value into a corresponding mood string.
     * the numeric representation of the mood
     * return a string representing the mood (Happy, Scared, or Normal)
     */
    public String translateMoods(int mood) {
        if (mood == MOODS.MOOD_HAPPY.ordinal()) {
            return "Happy";
        } else if (mood == MOODS.MOOD_SCARE.ordinal()) {
            return "Scared";
        } else {
            return "Normal";
        }
    }
}
