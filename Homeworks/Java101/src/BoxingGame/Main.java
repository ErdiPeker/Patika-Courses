package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 9, 100, 90,50);
        Fighter f2 = new Fighter("Mike Tyson", 12, 110, 95,20);

        Match match = new Match(f1, f2, 90, 100);
        match.run();
    }


}
