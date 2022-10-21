package BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter( String name, int damage, int health, int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int hit(Fighter opponent){
        if(opponent.isDodge()){
            System.out.println(opponent.name+ " has dodged the punch!");
            return opponent.health;
        }
        System.out.println(this.name + " has hit "+this.damage+" damage to " + opponent.name);
        if(opponent.health<this.damage) return 0;
        return opponent.health-this.damage;

    }
    boolean isDodge(){
        double randomNumber= Math.random()*100;
        return randomNumber<=this.dodge;
    }
}
