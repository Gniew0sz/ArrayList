import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
            System.out.println(list.get(i));
        }
        System.out.println("The second biggest number is " + findSecondLargest(list));


    }
    int findSecondLargest(ArrayList<Integer> list) {
        int biggest=list.get(0);
        int secondBiggest=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > biggest) {
                biggest = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > secondBiggest&&list.get(i)!=biggest) {
                secondBiggest = list.get(i);
            }
        }
        return secondBiggest;
    }
}
