import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("List 1: "+list);

        for (int i = 0; i < 13; i++) {
            linkedList.add((int)(Math.random() * 100));
        }
        System.out.println("List 2: "+linkedList);
        System.out.println("The merged lists are: " + mergeAndAlternate(list, linkedList));
    }

    ArrayList<Integer> mergeAndAlternate(ArrayList<Integer> list, LinkedList<Integer> linkedList) {

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> list1;
        LinkedList<Integer> list2;

        if (list.size() <= linkedList.size()) {
            list1 = list;
            list2 = linkedList;
        } else {
            list1 = new ArrayList<>(linkedList);
            list2 = new LinkedList<>(list);
        }

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        for (int i = list1.size(); i < list2.size(); i++) {
            result.add(list2.get(i));
        }

        return result;
    }
}
