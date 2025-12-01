import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            list.add((int)(Math.random()*100+1));
        }
        long stop = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            linkedList.add((int)(Math.random()*100+1));
        }
        long end = System.currentTimeMillis();
        long listTime = stop - start;
        long linkedListTime = end - stop;
        System.out.println("The time for ArrayList: " + listTime + "ms");
        System.out.println("The time for LinkedList: " + linkedListTime + "ms");
    }
}