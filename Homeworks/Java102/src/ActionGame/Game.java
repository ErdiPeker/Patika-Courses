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

        Location location=null;

        while (true){
            System.out.println("------------------------------");
            player.printInfo();
            System.out.println("-----------Locations----------");
            System.out.println("1-Safe House");
            System.out.println("2-Tool Store");
            System.out.println("3-Cave....(1-3 Zombies could be found!, Award : Food)");
            System.out.println("4-Forest....(1-3 Vampires could be found!, Award : Firewood)");
            System.out.println("5-River....(1-3 Bears could be found!, Award : Water)");
            System.out.println("6-Mine....(1-5 Snakes could be found!, Award based on chance)");
            System.out.println("Please choose where to go !");
            int selectLoc=input.nextInt();
            switch (selectLoc){
                case 2:
                    location= new ToolStore(player);
                    break;
                case 3:
                    location= new Cave(player);
                    break;
                case 4:
                    location= new Forest(player);
                    break;
                case 5:
                    location= new River(player);
                    break;
                case 6:
                    location= new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if(!location.onLocation()){
                System.out.println("Game Over!");
                break;
            }

        }

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
