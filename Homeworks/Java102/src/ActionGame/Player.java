package ActionGame;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private GameChar character;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory= new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};

        System.out.println("---------------------------------------------\nCHARACTERS: ");

        for (GameChar charac: charList){
            System.out.println(charac.getId()+"."+charac.getName()+"\t"+
                    "Damage:"+charac.getDamage()+"\t"+
                    "Health:"+charac.getHealth()+"\t"+
                    "Money:"+charac.getMoney());
        }
        System.out.println("---------------------------------------------");
        int selectChar= input.nextInt();
        switch (selectChar){
            case 2:
                this.character=new Archer();
                break;
            case 3:
                this.character=new Knight();
                break;
            default:
                this.character=new Samurai();

        }
        System.out.println(this.character.getName()+"\n"+
                        "Damage:"+this.character.getDamage()+"\n"+
                        "Health:"+this.character.getHealth()+"\n"+
                        "Money:"+this.character.getMoney());
    }

    public void printInfo(){
        System.out.println(this.character.getName()+
                ", Weapon : "+this.getInventory().getWeapon().getName() +
                ", Damage : "+this.getTotalDamage()+
                ", Health : "+this.character.getHealth()+
                ", Money : "+this.character.getMoney());
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public String getName() {
        return name;
    }

    public int getTotalDamage(){
        return this.character.getDamage()+this.inventory.getWeapon().getDamage();
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameChar getCharacter() {
        return character;
    }

    public void setCharacter(GameChar character) {
        this.character = character;
    }
}
