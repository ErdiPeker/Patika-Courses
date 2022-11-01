package ActionGame;

import java.util.Scanner;

public class Game {
    private Player player;
    //private Location location;
    private Scanner input= new Scanner(System.in);

    public void start(){
        System.out.println("The Island !");
        System.out.print("Please enter your name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Dear "+player.getName() +", welcome to our dark and foggy island ! All the actions in this island are gruesomely real !");
        System.out.println("Please, choose a character to start this experience ! ");
        player.selectChar();

    }

    /*public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    */

}
