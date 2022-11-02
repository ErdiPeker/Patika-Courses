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
        }


        return true;
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
