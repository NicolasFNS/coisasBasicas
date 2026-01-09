/* o que normalmente se vê quando se inicia em java para comparar o menor é

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int min = args[0];
      for (int i = 1; i < args.length; i++){
        min = args[i] < min ? args[i] : min;
        if(args[i]< min){
          min = args[i];
        }
      }
      return min;
    }
}

ou

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int min = args[0];
      for (int i = 0; i < args.length; i++){
        min = args[i] < min ? args[i] : min;
      }
      return min;
    }
}

mas atualmente uma ferramnenta no java também faz esse trabalho
*/

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}

//ou

import java.util.stream.IntStream;

public class SmallestIntegerFinder2 {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}
