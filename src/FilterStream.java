import java.util.Arrays;
import java.util.List;

public class FilterStream {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    list.stream().filter(num -> (num % 5 == 0)).toList();
  }
}
