import java.util.HashMap;
import java.util.Scanner;

public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);

    HashMap<Integer , String> users = new HashMap<>();
    users.put(120045, "Влад");
    users.put(551204, "Марина");
    users.put(120035, "Саша");
    users.put(541204, "Паша");

    for (String value : users.values()) {
        System.out.println(value);
    }

    System.out.println("get:");
    String name = users.get(scanner.nextInt());
    System.out.println(name);

    System.out.println("remove:");
    String rem = users.remove(scanner.nextInt());
    for (String value : users.values()) {
        System.out.println(value);
    }

}