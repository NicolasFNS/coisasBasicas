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

import java.util.*;

public class Snail {

    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0){
            return new int[0];
        }
      
        List<Integer> result = new ArrayList<>();

        int minY = 0;
        int maxY = array.length - 1;
        int minX = 0;
        int maxX = array[0].length - 1;

        while (minY <= maxY && minX <= maxX) {
          
            for (int i = minX; i <= maxX; i++) {
                result.add(array[minY][i]);
            }
            minY++;

            for (int i = minY; i <= maxY; i++) {
                result.add(array[i][maxX]);
            }
            maxX--;

            if (minY <= maxY) {
                for (int i = maxX; i >= minX; i--) {
                    result.add(array[maxY][i]);
                }
                maxY--;
            }

            if (minX <= maxX) {
                for (int i = maxY; i >= minY; i--) {
                    result.add(array[i][minX]);
                }
                minX++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*o desafio era que a função recebesse uma matriz e o código percorresse em espiral e listasse os itens*/

