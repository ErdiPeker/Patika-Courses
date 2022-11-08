package MatchFixture;

import java.util.*;

public class Teams {
    public static Scanner input =new Scanner(System.in);
    public static List<String> teamList = new LinkedList<>();

    public static void getTeams(){
        System.out.print("Please enter the number of teams : ");
        int numberOfTeams=input.nextInt();
        int numberOfRounds=(numberOfTeams-1)*2;

        if(numberOfTeams%2==1){
            teamList.add("Pass");
        }

        System.out.println("Please enter the names of the teams.");

        for(int i=0;i<numberOfTeams;i++){
            String name= input.next();
            teamList.add(name);
        }

        System.out.println("The teams in the tournament: ");
        for (String name:teamList){
            System.out.println(name);
        }

        round(numberOfRounds,numberOfTeams);
    }

    public static void round(int numberOfRounds,int numberOfTeams){
        HashMap<String,List<String>> matches = new HashMap<>();
        for(String team: teamList){
            matches.put(team,new LinkedList<>());
        }

        for (int i=0;i<numberOfRounds;i++){
            List<String> weekTeams = new LinkedList<>(teamList);

            for(int j=0; j< numberOfTeams/2;j++){
                int rand=(int)Math.floor(Math.random()*weekTeams.size());

            }

        }

    }

}
