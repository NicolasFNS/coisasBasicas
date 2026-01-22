public class Kata {//desafio que retorna true se o "ending" estiver no fim de "str"
  public static boolean solution(String str, String ending) {
    if (ending.length() > str.length()) {//o desafio mostrou o erro "String index out of range: -1", esse if evita que o "ending" seja maior que "str"
      return false;
    }
    
    int leng = str.length() - 1;
    
    for (int i = ending.length() - 1; i >= 0; i--) {
      if (ending.charAt(i) != str.charAt(leng)) {
        return false;
      }
      leng--;
    }
    return true;
  }
}
