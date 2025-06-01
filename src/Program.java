import java.util.*;
import java.util.stream.*;
import java.util.Map.*;

class Bowling {

    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    void getWinner() {

        ArrayList listOfEntry = new ArrayList<>(players.entrySet());

        ArrayList<Integer> v = players.values().stream().collect(Collectors.toCollection(ArrayList::new));

        Iterator it = players.entrySet().iterator();

	    while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry) it.next();
            if (entry.getValue() == Collections.max(v)){
                System.out.println(entry.getKey());
            }

        }
    }
}

public class Program {
    public static void main(String[ ] args) {

        Bowling game = new Bowling();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){

            String input = sc.nextLine();

            String[] values = input.split(" ");

            String name = values[0];

            int points = Integer.parseInt(values[1]);

            game.addPlayer(name, points);
        }
       game.getWinner();
    }
}