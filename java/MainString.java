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
