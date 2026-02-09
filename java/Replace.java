/*
desafio básico do codewars:
"Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string."
*/
public class Replace {
  public static String fakeBin(String numberString) {
    
    String novo = numberString.replaceAll("[0-4]","0").replaceAll("[5-9]", "1");
    
    return novo;
  }
}
/* 
o código acima muda os números de 0 a 4 e de 5 a 0
com letras, como por exemplo vogais maiúsculas e minúsculas dá para fazer assim:
return str.replaceAll("[aeiouAEIOU]", "");
*/

/*
pode servir como removedor de espaços com return x.replace(" ","");
mas se quiser remover apenas o espaços do começo e fim, use x.trim();
*/

/* acima é um exemplo mais simplificado, mas para prática geral pode ser melhor conhecer o processo

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
