

public class CharacterCreator {
    public static void main(String[] args){
        //Build a new character
        Wizard shekyut =new Wizard();
        Wizard cyri = new Wizard("Cyri");

        System.out.println(cyri.name);
        System.out.println(Wizard.magicType);
        System.out.println(cyri.getLevel());

        cyri.levelUp();
        System.out.println(cyri.getLevel());


    }
}
