import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want me to generate? :");
        int n  = input.nextInt();
        for(int i = 0; i < n; i++){
            list.add((int)(Math.random()*10+1));
        }
        System.out.println("The list is: ");
        list.forEach(System.out::println);
        System.out.println("The reversed list is: ");
        reverseList(list);
    }

    static void reverseList(ArrayList<Integer> list){
        for(int i = list.size()-1;i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}