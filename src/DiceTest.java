public class DiceTest {

    void go(){
        int sumOf100Rolls = 0;
        int averageValueOf100Rolls;
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            dice.rollDice();
            System.out.println(dice);
            sumOf100Rolls += dice.faceValue;
        }
        averageValueOf100Rolls = sumOf100Rolls / 100;
        System.out.println(sumOf100Rolls);
        System.out.println(averageValueOf100Rolls);
    }
    public static void main(String[] args) {
        new DiceTest().go();
    }
}