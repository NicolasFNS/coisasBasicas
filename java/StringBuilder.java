/*
como o nome ja sugere, ele serve para construir strings
mas serve para usar a construção de string com lógicas incluídas
como por exemplo um algoritmo que inverte strings
*/

//o que eu fiz no desafio do codewars
public class StringBuilder {
  public static String solution(String str) {
    StringBuilder letra = new StringBuilder();
    
    for(int i = str.length() - 1; i >= 0; i--){
      letra.append(str.charAt(i));
    }
    
    return letra.toString();
  }
}

/*o que eu poderia ter feito
public class StringBuilder {

  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}
*/
