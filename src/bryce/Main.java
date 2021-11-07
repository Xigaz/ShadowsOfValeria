package bryce;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
//
//        for(int i = 0; i < 10;i++ )
//        {
//            int diceRoll = rand.nextInt(600000000) % 6 + 1;
//            int numberRace = rand.nextInt(500000000) % 5;
//            Race randoRace = Race.values()[numberRace];
//
//            Dice dice1 = new Dice(randoRace, diceRoll);
//
//            System.out.println("Value: " + dice1.value);
//            System.out.println("Discount: " + dice1.discount);
//            System.out.println("Race: " + dice1.race);
//
//        }

        BattlePlanDeck x = new BattlePlanDeck();

        System.out.println(x.getPlanCards());
    }
}