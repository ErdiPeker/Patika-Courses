package BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            if (isF1Starting()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " remaining hp: " + this.f2.health);
                    if (isOver()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " remaining hp: " + this.f1.health);
                    if (isOver()) {
                        break;
                    }
                }
            }else{
                while (this.f1.health > 0 && this.f2.health > 0) {
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " remaining hp: " + this.f1.health);
                    if (isOver()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " remaining hp: " + this.f2.health);
                    if (isOver()) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isOver() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " has won!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " has won!");
            return true;
        }
        return false;
    }

    boolean isF1Starting() {
        double randomNumber = Math.random() * 100;
        return randomNumber > 50;
    }

}
