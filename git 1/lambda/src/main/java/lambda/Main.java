package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, List<Integer>> ausdruck = (offset, n) -> {
      List<Integer> result = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        result.add(i + offset);
      }
      return result;
    };

    List<Integer> berechnen = ausdruck.apply(-3, 6);

    System.out.println(berechnen);


  }

}
