package ActionGame;

import java.util.Locale;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Player player, String name ,Monster monster,String award,int maxMonster) {
        super(player, name);
        this.monster=monster;
        this.award=award;
        this.maxMonster=maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber= this.randomMonsterNumber();

        System.out.println(this.getName());
        System.out.println("Be careful! There are "+ monsterNumber +" "+this.monster.getName()+"s here!");
        System.out.print("<F>ight or <R>un : ");
        String selectCase=Location.input.nextLine().toUpperCase();
        if(selectCase.equals("F")){
            System.out.println("Fight begins!");
            if(combat(monsterNumber)){
                System.out.println("You have won the location");
                return true;
            }
        }

        if (this.getPlayer().getCharacter().getHealth()<=0){
            System.out.println("You have died!");
            return false;
        }


        return true;
    }

    public boolean combat(int monsterNumber){
        for (int i=1; i<=monsterNumber;i++){
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getCharacter().getHealth()>0 && this.getMonster().getHealth()>0){
                System.out.println("<H>it or <R>un");
                String selectCombat=Location.input.nextLine().toUpperCase();
                if (selectCombat.equals("H")){
                    System.out.println("You hit " + this.getPlayer().getTotalDamage()+" damage!");
                    this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getMonster().getHealth()>0){
                        System.out.println(this.getMonster().getName()+" hit you "+ this.getMonster().getDamage()+" damage!");
                        int monsterDamage= this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(monsterDamage<0){
                            monsterDamage=0;
                        }
                        this.getPlayer().getCharacter().setHealth(this.getPlayer().getCharacter().getHealth()-monsterDamage);
                        afterHit();
                    }
                }
            }

            if(this.getMonster().getHealth()<this.getPlayer().getCharacter().getHealth()){
                System.out.println("You have killed the monster!");
                System.out.println("You have won "+this.getMonster().getAward()+" gold.");
                this.getPlayer().getCharacter().setMoney(this.getPlayer().getCharacter().getMoney()+this.getMonster().getAward());
                System.out.println("Your balance is "+this.getPlayer().getCharacter().getMoney()+" gold.");
            }
            else{
                return false;
            }
        }

        return false;
    }
    public void playerStats(){
        System.out.println("-------  Player Status  -------");
        System.out.println("Health : " +this.getPlayer().getCharacter().getHealth());
        System.out.println("Damage : " +this.getPlayer().getTotalDamage());
        System.out.println("Money : " +this.getPlayer().getCharacter().getMoney());
        if(this.getPlayer().getInventory().getWeapon().getDamage()>0){
            System.out.println("Weapon : " +this.getPlayer().getInventory().getWeapon().getName());
        }
        if(this.getPlayer().getInventory().getArmor().getBlock()>0){
            System.out.println("Armor : " +this.getPlayer().getInventory().getArmor().getName());
            System.out.println("Block : " +this.getPlayer().getInventory().getArmor().getBlock());
        }
    }

    public void monsterStats(int i){
        System.out.println("-------  Monster Status  -------");
        System.out.println("Name : "+ i + "."+this.getMonster().getName());
        System.out.println("Health : "+this.getMonster().getHealth());
        System.out.println("Damage : "+this.getMonster().getDamage());
        System.out.println("Award : "+this.getMonster().getAward());
    }

    public void afterHit(){
        System.out.println("-------  Fight Status  -------");
        System.out.println("Your Health : " +this.getPlayer().getCharacter().getHealth());
        System.out.println(this.getMonster().getName() + "'s Health : "+this.getMonster().getHealth());
    }

    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonster())+1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
