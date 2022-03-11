import java.util.Random;

public class Dice {
    Random random = new Random();
    int faceValue;

    void rollDice(){
        faceValue = random.nextInt(6)+1;
    }
    @Override
    public String toString() {
        return "Dice{" +
                "faceValue=" + faceValue +
                '}';
    }
}
