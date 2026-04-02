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

//////////////////////
public class Replace {
  public static String fakeBin(String numberString) {
    
    String novo = numberString.replaceAll("[0-4]","0").replaceAll("[5-9]", "1");
    
    return novo;
  }
}
/* 
o código acima muda os números de 0 a 4 e de 5 a 9
com letras, como por exemplo vogais maiúsculas e minúsculas dá para fazer assim:
return str.replaceAll("[aeiouAEIOU]", "");
*/

/*
pode servir como removedor de espaços com return x.replace(" ","");
mas se quiser remover apenas o espaços do começo e fim, use x.trim();
*/

/* acima é um exemplo simplificado, mas para prática geral pode ser melhor conhecer o processo

public class Replace {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder(); //construtor da nova string (para poder usar o append)

        for (int i = 0; i < numberString.length(); i++) {
        
            char digit = numberString.charAt(i); //pega o dígito
            int num = Character.getNumericValue(digit); //converte para número para poder fazer a comparação de valor

            if (num <= 5) {
                result.append('0');
            } else {
                result.append('1');
            }
        }

        return result.toString(); //o desafio precisava verificar uma string
    }
}
*/

////////////////////////////
public class StringBuilder {
  public static String solution(String str) {
    StringBuilder letra = new StringBuilder();
    
    for(int i = str.length() - 1; i >= 0; i--){
      letra.append(str.charAt(i));
    }
    
    return letra.toString();
  }
}
//desafio era apenas inverter a string
/*o que eu poderia ter feito
public class StringBuilder {

  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}
*/

/////////////////////////
public class ToUpperCase {
  
  public static String makeUpperCase(String str) {//tudo maiúsculo
    return str.toUpperCase();
  }

  public static String capitalizeFirstTrim(String s) {//coloca uma letra maiúscula no começo
    if (s == null) return null;//evita NullPointerException

    s = s.trim();//remove espaço em branco do começo e fim
    if (s.isEmpty()) return s;//para caso não ter conteúdo

    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }
  
}
//desafio pediu uma função que retorna uma string com letra maiúscula (não tinha entendido se era completa ou apenas a primeira letra
