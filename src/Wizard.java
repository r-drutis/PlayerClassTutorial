// Inherits methods from PlayerCharacter and PreparedCaster
// Must implement the abstract methods from these classes
public class Wizard extends PlayerCharacter implements PreparedCaster {

    // Class/Static variables - shared by all objects of the class
    public static MagicType magicType = MagicType.ARCANE;
    private final static String hitDie = "1d4";

    // Instance Variables - declared in the class outside a method or constructor
    private int level;
    private int maxHitPoints;
    private int currentHitPoints;
    public String name;
    public String hatSize = "X-Large";

    public Wizard(){

    }

    // Constructor method - Creates a level 1 wizard object
    public Wizard(String name){
        super(name);
        this.level = 1;
        this.name = name;
        this.maxHitPoints = 4;
        this.currentHitPoints = this.maxHitPoints;
    }

    // Overloaded constructor method - create a wizard starting at a level
    public Wizard(String name, int level){
        super(name);
        this.name = name;
        this.maxHitPoints = 4 + DieRoller.roll(Wizard.hitDie);
        this.currentHitPoints = this.maxHitPoints;
    }

    // Player Character methods
    public void levelUp(){
        System.out.println(this.name + " has leveled up!");
        this.level++;
        this.maxHitPoints += DieRoller.roll(Wizard.hitDie);
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    public void attack(){
        System.out.println("I AM ATTACKING SOMETHING");
    }

    public void shortRest(int hitDiceRecovered){
        // Local variable - can't be called outside the scope of the shortRest method
        int recoveryRoll = DieRoller.roll(Wizard.hitDie) * hitDiceRecovered;
        this.currentHitPoints = this.currentHitPoints + recoveryRoll;
        this.arcaneRecovery();
    }

    // This method overrides a method in the parent class
    @Override
    public void longRest(){
        this.currentHitPoints = this.maxHitPoints;
        this.prepareSpells();
    }

    @Override
    public int getCurrentHitPoints() {
        return this.currentHitPoints;
    }

    // Prepared caster methods
    public void prepareSpells(){
        System.out.println("I'M PREPARING MY SPELLS");
    }


    public void castSpell(String spellName, int level){
        System.out.println("I'M CASTING A SPELL");
    }

    // Wizard methods
    public void arcaneRecovery(){
        System.out.println("I'M RECOVERING A SPELL SLOT");
    }


}
