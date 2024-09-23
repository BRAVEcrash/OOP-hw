import java.util.Random;

public class Dice {
    private int value;
    private static Random rand = new Random();

    // Constructor initializes the die with a random value
    public Dice() {
        roll(); // Initialize with a random value
    }

    // Method to roll the die and generate a new value between 1 and 6
    public void roll() {
        this.value = rand.nextInt(6) + 1; // 1 to 6
    }

    // Getter method to retrieve the current value of the die
    public int getValue() {
        return this.value;
    }
}
