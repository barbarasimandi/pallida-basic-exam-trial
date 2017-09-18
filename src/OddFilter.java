import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every odd element from the orignal list

    System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));

    // should print [1, 3, 5]

  }

  public static ArrayList<Integer> oddFilter(List<Integer> arrListInput) {

    ArrayList<Integer> arrListOdd = new ArrayList<>();

    for (int i = 0; i < arrListInput.size(); i++) {
      if (arrListInput.get(i) % 2 == 1) {
        arrListOdd.add(arrListInput.get(i));
      }
    }
    return arrListOdd;
  }
}