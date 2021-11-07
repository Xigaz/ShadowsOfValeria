package bryce;

import java.util.ArrayList;
import java.util.Collections;

public class BattlePlanDeck
{
    private final ArrayList<BattlePlanCards> planCards = new ArrayList<>();

    public BattlePlanDeck()
    {

//        for(int i = 0; i < 100; i++)
//        {
//                planCards.add(new BattlePlanCards());
//        }



        planCards.add(new BattlePlanCards(new Race[] {Race.GOBLIN, Race.SKELETONS}, BattleType.CLASH));
        planCards.add(new BattlePlanCards(new Race[] {Race.ORC, Race.GNOLLS}, BattleType.SEIGE));
        planCards.add(new BattlePlanCards(new Race[] {Race.GNOLLS, Race.GARGOYLE}, BattleType.AMBUSH));
        planCards.add(new BattlePlanCards(new Race[] {Race.ORC, Race.SKELETONS}, BattleType.CLASH));
        planCards.add(new BattlePlanCards(new Race[] {Race.GOBLIN, Race.GNOLLS}, BattleType.AMBUSH));


    }

    public ArrayList<BattlePlanCards> getPlanCards()
    {
        return planCards;
    }

}
