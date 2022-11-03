package ActionGame;

import java.util.Random;

public class Snake extends Monster{
    Random random = new Random();
    private int extraDamage = random.nextInt(4);
    public Snake() {
        super("Snake",4,3,12,0);
        this.setDamage(this.getDamage()+extraDamage);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }



}
