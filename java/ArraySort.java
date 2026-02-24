public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
}

/*
o desafio era criar um algoritmo que organiza o array em ordem alfabética com case-sensistive e adiciona *** entre as letras da primeira palavra do array
eu fiz desse modo:
import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s) {
    Arrays.sort(s);

    String str = s[0];
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        sb.append(str.charAt(i));
        if (i < str.length() - 1) {
            sb.append("***");
        }
    }

    return sb.toString();
  }
}
*/
