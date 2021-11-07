package bryce;

import java.util.ArrayList;
import java.util.Arrays;

public class BattlePlanCards
{
        // Races
        private final ArrayList<Race> races ;
        private final BattleType type;

        public BattlePlanCards(Race[] r, BattleType t)
        {
                type = t;
                races = new ArrayList<>();
                races.addAll(Arrays.asList(r));
        }

        public BattleType getType()
        {
                return type;
        }

        public ArrayList<Race> getRaces()
        {
                return races;
        }

        public String toString()
        {
                return String.format("%s: %s", races,  type);
        }

}
