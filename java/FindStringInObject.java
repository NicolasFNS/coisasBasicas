//o objetivo era encontrar a palavra "needle" em haystack

public class Kata {
  public static String findNeedle(Object[] haystack) {
    
    for (int i = 0; i < haystack.length; i++) {
        if ("needle".equals(haystack[i])) {
            return "found the needle at position " + i;
        }
    }
    
    return "not found";
  }
}

/* também poderia ser usado o seguinte código 

public class Kata {
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
  }
}

*/
