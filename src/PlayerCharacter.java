public abstract class PlayerCharacter {



    public abstract void levelUp();
    public abstract int getLevel();
    public abstract int getCurrentHitPoints();
    public abstract void attack();
    public abstract void shortRest(int hitDiceRecovered);
    public abstract void longRest();

    public PlayerCharacter(){
        System.out.println("The default constructor was called.");
    }

    public PlayerCharacter(String name){
        System.out.println("The superclass constructor was called.");
    }


}
