import java.util.Arrays;

/**
 * Created by danielszalay on 2017. 03. 22..
 */
// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

public class Colors {
  public static void main(String[] args) {
    String[][] colors = {
      {"lime", "forest green", "olive", "pale green", "spring green"},
      {"orange red", "red", "tomato"},
      {"orchid", "violet", "pink", "hot pink"}
    };

    System.out.println(Arrays.toString(colors[0]));
    System.out.println(Arrays.toString(colors[1]));
    System.out.println(Arrays.toString(colors[2]));
  }
}