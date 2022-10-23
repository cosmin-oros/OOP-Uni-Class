package Course;

// interface -> pure abstract class
interface FootballPlayer{
    // they are public automatically, static final
    int category = 5;
    void playsFootball();
}

class GoodFootballPlayer implements FootballPlayer{
    @Override
    public void playsFootball() {
        System.out.println("I'm a good football player");
    }
}

interface TennisPlayer{
    void playsTennis();
}

class PlayerFootballAndTennis implements FootballPlayer, TennisPlayer{
    @Override
    public void playsFootball() {
        System.out.println("I play football");
    }

    @Override
    public void playsTennis() {
        System.out.println("I play tennis");
    }
}

class GoodFootballAndTennisPlayer extends GoodFootballPlayer implements TennisPlayer{
    @Override
    public void playsTennis() {
        System.out.println("I play tennis");
    }
}

class InterfacesEx {
    public static void main(String[] args){
        FootballPlayer fp;

        fp = new GoodFootballPlayer();

        fp = new PlayerFootballAndTennis();
        fp.playsFootball();
        ((PlayerFootballAndTennis)fp).playsTennis();
    }
}
