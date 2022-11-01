package ActionGame;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private GameChar character;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
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
            case 1:
                character=new Samurai();
                break;
            case 2:
                character=new Archer();
                break;
            case 3:
                character=new Knight();
                break;
            default:
                character=new Samurai();

        }
        System.out.println(character.getName()+"\n"+
                        "Damage:"+character.getDamage()+"\n"+
                        "Health:"+character.getHealth()+"\n"+
                        "Money:"+character.getMoney());
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

    public void setName(String name) {
        this.name = name;
    }


}
