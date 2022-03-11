package lambda;

import java.util.List;

public class ForEach {

  public static void main(String[] args) {
    List<String> buchstaben = List.of("a","b","c");
//    for (String s : buchstaben) {
//      System.out.println(s);
//    }

    buchstaben.forEach(s -> System.out.println(s));

  }

}
