import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("List 1: "+list);

        System.out.println("The longest sequence is: " + findLongestSequence(list));
    }

    public static ArrayList<Integer> findLongestSequence(ArrayList<Integer> nums) {
        HashSet<Integer> set = new HashSet<>(nums);
        ArrayList<Integer> longest = new ArrayList<>();

        for (int n : set) {
            if (!set.contains(n - 1)) {
                ArrayList<Integer> current = new ArrayList<>();
                int x = n;

                while (set.contains(x)) {
                    current.add(x);
                    x++;
                }

                if (current.size() > longest.size()) {
                    longest = current;
                }
            }
        }

        return longest;
    }
}
