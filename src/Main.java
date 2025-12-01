import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void main(String[] args) {
        ArrayList<String> list = new  ArrayList<>();
        list.add("James");
        list.add("Robert");
        list.add("Marcus");
        list.add("Claire");
        list.add("Greg");
        int n  = list.size();
        for(int i = 0; i < n; i++){
            list.forEach(System.out::print);
            System.out.println();
            list.remove(0);
        }

    }
}