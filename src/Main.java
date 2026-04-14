import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        // HashMap Example
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 40);
        bogieCapacityMap.put("Cargo", 100);

        System.out.println("Train Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // LinkedHashSet Example
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper"); // Duplicate ignored

        System.out.println("Final Train Formation: " + trainFormation);
    }
}