package ActionGame;

public class Monster {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int award;
    private int originalHealth;
    private final double chance = Math.random();

    public Monster(String name, int id, int damage, int health,int award) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.award=award;
        this.originalHealth=health;
    }

    public int chanceAward(){
        double second = Math.random();
        int res =0;
        if(chance<0.15){
            if(second<0.50){
                res=11;
            }else if(second<0.80){
                res=12;
            }else{
                res=13;
            }
        }else if(chance<0.30){
            if(second<0.50){
                res=21;
            }else if(second<0.80){
                res=22;
            }else{
                res=23;
            }
        } else if(chance<0.55){
            if(second<0.50){
                res=31;
            }else if(second<0.80){
                res=32;
            }else{
                res=33;
            }
        }
        return res;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
