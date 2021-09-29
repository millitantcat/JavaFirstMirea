package ru.mirea.task3;

public class Human
{
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(int headtype, int fingers, int legs)
    {
        this.head = new Head(headtype);
        this.hand = new Hand(fingers);
        this.leg = new Leg(legs);
    }

    public void HumanWink()
    {
        head.Wink();
    }

    public void HumanCrisp()
    {
        leg.Crisp();
    }

    public void HumanClap()
    {
        hand.Clap();
    }
}