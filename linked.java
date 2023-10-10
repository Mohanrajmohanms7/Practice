import java.util.LinkedList;

public class linked {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("innovasion");
    cars.add("private");

    cars.addFirst("TEKFILO");
    cars.addLast("limite");
    System.out.println(cars);
     System.out.println(cars.size());
  }
}
