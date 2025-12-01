import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void main(String[] args) {
        ArrayList<String> list = new  ArrayList<>();
        Scanner input = new Scanner(System.in);
        list.add("Lorem");
        list.add("ipsum");
        list.add("dolor");
        list.add("sit");
        list.add("amet");
        System.out.println("The list is: ");
        list.forEach(System.out::println);
        System.out.println("The sentence is: "+ concatenate(list));
    }
    static String concatenate(ArrayList<String> list){
        String result = "";
        for(int i = 0; i < list.size(); i++){
            result += list.get(i)+" ";
        }
        return result;
    }
}