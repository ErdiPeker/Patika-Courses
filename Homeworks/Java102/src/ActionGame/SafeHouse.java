package ActionGame;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }


    @Override
    public boolean onLocation() {
        System.out.println("You are at Safe House ! Your health is replenished !");
        return true;
    }
}
