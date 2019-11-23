class Cricketer
{
    private String name;
    private int matchesPlayed;
    private int runsScored;

    public Cricketer(String name, int matchesPlayed, int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    
    
     public void print()
    {
        System.out.println(name  + " played " + matchesPlayed + " matches and scored " + runsScored + " runs.");
    }
}

class Batsmen extends Cricketer
{
    private int numberOfCenturies;
    private int numberOfHalfCenturies;

    public Batsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
    }

    
    public void print1()
    {    
        print();
        System.out.println(" He is a strong batsmen and made " + numberOfCenturies +  " centuries and " + numberOfHalfCenturies + " half centuries.");
    }
}


class Bowler extends Cricketer
{
    private int numberOfWickets;
    private int numberOf5WicketInnings;
    
    public Bowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfWickets= numberOfWickets;
        this.numberOf5WicketInnings = numberOf5WicketInnings;
    }

   
    public void print1()
    {    
        print();
        System.out.println(" He is also a good bowler and has taken " + numberOfWickets + " wickets. He has " + numberOf5WicketInnings + " 5WI(5-Wicket Innings) in his account.");
    }

}

class WicketKeeper extends Cricketer
{
    private int numberOfCatches;
    private int numberOfStumpings;
    
    public WicketKeeper(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

    
    public void print1()
    {    
        print();
        System.out.println(" He also keeps the wickets and has " + numberOfCatches + " catches and " + numberOfStumpings + " stumpings in his account.");
    }
}


class CricketPlayers
{
    public static void main(String arg[])
    {
      
        
        Batsmen b = new Batsmen("Sachin", 250, 11324, 100, 125);
        b.print1();
        WicketKeeper w = new WicketKeeper("Dhoni", 153, 6021, 120, 67);
        w.print1();
        Bowler b1 = new Bowler("Bumrah", 15, 200, 60, 10);
        b1.print1();
      
    }
}
