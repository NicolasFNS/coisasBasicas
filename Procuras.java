public class Min {
    public static int findSmallestInt(int[] args) {
      int min = args[0];
      for (int i = 1; i < args.length; i++){
        if(args[i]< min){
          min = args[i];
        }
      }
      return min;
    }
}

/*ou

public class Min {
    public static int findSmallestInt(int[] args) {
      int min = args[0];
      for (int i = 0; i < args.length; i++){
        min = args[i] < min ? args[i] : min;
      }
      return min;
    }
}

mas atualmente uma ferramnenta no java também faz esse trabalho

import java.util.Arrays;

public class Min {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}

ou

import java.util.stream.IntStream;

public class Min {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}
*/

/////////////////////
public class ForEach{
  
  public static int squareSum(int[] n){ 
    int vari = 0;
    
    for(int item : n){
      item = item * item;//a variável item é apenas uma variável "descartável", então ela não vai alterar o array original "n"
      vari += item;

      //pode simplificar com vari += item * item;
    }

    /*se eu quisesse alterar o array original, teria que ser pela estrutura do "for" original:
      for (int i = 0; i < n.length; i++) {
        n[i] = n[i] * n[i];
      }
    */
    
    return vari;
  }
}
//o desafio era completar as funções quadradas, quando cada número passa (na lista "n"), o código multiplica por ela mesma e soma todos os resulados

/////////////////////
public class IndexOf {

  public static int getCount(String str) {
    int cont = 0;
    for(int i = 0; i < str.length(); i++){
      char letra = str.charAt(i);
      if("aeiouAEIOU".indexOf(letra) != -1){
        cont++;
      }
    }
    return cont;
  }

}

/*o objetivo era apenas contar o número de vogais
indexOf retorna em que posição aquela string está, como colocamos apenas vogais para comparar com cada letra da string
enviada, teremos que contar apenas as vezes em que é achado algo, quando indexOf não acha nada, ele retorna -1
*/

////////////////////
public class CharAt {
  public static boolean solution(String str, String ending) {
    if (ending.length() > str.length()) {//o teste do desafio mostrou o erro "String index out of range: -1", esse if vê se o "ending" é maior que "str"
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
//desafio que retorna true se o "ending" estiver no fim de "str"

////////////////////////////////
public class FindStringInObject {
  public static String findNeedle(Object[] haystack) {
    
    for (int i = 0; i < haystack.length; i++) {
        if ("needle".equals(haystack[i])) {
            return "found the needle at position " + i;
        }
    }
    
    return "not found";
  }
}
//o objetivo era encontrar a palavra "needle" em haystack
/* também poderia ser usado o seguinte código 

public class FindStringInObject {
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
  }
}
*/

//////////////////////
import java.util.Map;
import java.util.HashMap;

public class Welcome {
  private static final Map<String, String> linguas = new HashMap<>();
  static {
    linguas.put("english", "Welcome");
    linguas.put("czech", "Vitejte");
    linguas.put("danish", "Velkomst");
    linguas.put("dutch", "Welkom");
    linguas.put("estonian", "Tere tulemast");
    linguas.put("finnish", "Tervetuloa");
    linguas.put("flemish", "Welgekomen");
    linguas.put("french", "Bienvenue");
    linguas.put("german", "Willkommen");
    linguas.put("irish", "Failte");
    linguas.put("italian", "Benvenuto");
    linguas.put("latvian", "Gaidits");
    linguas.put("lithuanian", "Laukiamas");
    linguas.put("polish", "Witamy");
    linguas.put("spanish", "Bienvenido");
    linguas.put("swedish", "Valkommen");
    linguas.put("welsh", "Croeso");
  }

  public static String greet(String language){
    return linguas.getOrDefault(language, "Welcome");
  }
}
//o desafio era se certa linguagem for selecionada, retorne o equivalente
//é util para percorrer grandes volumes por ir direto no valor, sem percorrer toda a lista
/*
mas dá para resolver com matriz, o problema é que em Se a lista crescer muito, a busca continua sendo linear
public static String greet(String language){
    String retorno = "Welcome";
    
    String [][] linguas = {
      {"english", "Welcome"},
      {"czech", "Vitejte"},
      {"danish", "Velkomst"},
      {"dutch", "Welkom"},
      {"estonian", "Tere tulemast"},
      {"finnish", "Tervetuloa"},
      {"flemish", "Welgekomen"},
      {"french", "Bienvenue"},
      {"german", "Willkommen"},
      {"irish", "Failte"},
      {"italian", "Benvenuto"},
      {"latvian", "Gaidits"},
      {"lithuanian", "Laukiamas"},
      {"polish", "Witamy"},
      {"spanish", "Bienvenido"},
      {"swedish", "Valkommen"},
      {"welsh", "Croeso"}
    };
    
    for (int i = 0; i < linguas.length; i++) {
      if (language.equals(linguas[i][0])) {
        retorno = linguas[i][1];
        break;
      }
    }
    
    return retorno;
}
*/

///////////////////////////
public class ObjectEquals {
    public static boolean contains(Object[] array, Object value) {
        //se quiser use um if (array == null) return false; para não comparar nada nulo
        for (Object element : array) {
            if (Objects.equals(element, value)) return true;
        }
        return false;
    }
}

/*
o desafio pedia para verificar se um objeto expecífico existia na lista de arrays, 
também dá para usar o conteúdo do arquivo FindStringInObject.java no lugar(o que eu fiz), ou até:

public class ObjectEquals {
    public static boolean check(Object[] a, Object x) {
        return java.util.Arrays.asList(a).contains(x);
    }
}

*/
