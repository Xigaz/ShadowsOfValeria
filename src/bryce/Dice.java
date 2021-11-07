package bryce;

public class Dice
{
    Race race;
    int discount;
    int value;

    public Dice(Race r, int v)
    {
      race = r;
      value = v;
      discount = 6-value;
    }
}
