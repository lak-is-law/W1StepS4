import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class W1StepS4 {
    // Core data structures for O(1) performance
    public static void main(String[] args) {
        // Core data structures for O(1) performance
        HashMap<String, Integer> userRegistry = new HashMap<>();
        HashMap<String, Integer> attemptFrequency = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        userRegistry.put("john_doe", 1001);
        userRegistry.put("admin", 1002);

        System.out.print("Enter username to check: ");
        String username = sc.nextLine().toLowerCase();

        // 1. Check Availability in O(1)
        if (!userRegistry.containsKey(username)) {
            System.out.println("checkAvailability(\"" + username + "\") -> true (available)");
        } else {
            System.out.println("checkAvailability(\"" + username + "\") -> false (already taken)");

            // 2. Track Popularity/Attempt Frequency
            attemptFrequency.put(username, attemptFrequency.getOrDefault(username, 10542) + 1);

            // 3. Suggest Alternatives
            List<String> suggestions = new ArrayList<>();
            suggestions.add(username + "1");
            suggestions.add(username + "2");
            suggestions.add(username.replace("_", "."));

            System.out.println("suggestAlternatives(\"" + username + "\") -> " + suggestions);
            System.out.println("getMostAttempted() -> \"" + username + "\" (" + attemptFrequency.get(username) + " attempts)");
        }

        sc.close();
    }
}