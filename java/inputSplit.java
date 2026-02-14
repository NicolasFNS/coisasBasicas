/*
Você pergunta a uma menina: "Quantos anos você tem?" Ela sempre diz "x anos", onde x é um número aleatório entre 0 e 9.

Escreva um programa que retorne a idade da menina (0-9) como um número inteiro.

Suponha que a string de entrada de teste seja sempre uma string válida. 
Por exemplo, a entrada do teste pode ter "1 ano" ou "5 anos". O primeiro caractere da string é sempre um número.

o modo mais facil seria aproveitar que a idade sempre está no começo da string

*/

//pensei em dividir a string e pegar o valor inicial
public class CharProblem {
  public static int howOld(String input) { 
    String[] partes = input.split(" "); 
    return Integer.parseInt(partes[0]); 
  }
}

/*
também dá para usar no lugar algo tipo:
public class CharProblem {
  public static int howOld(final String herOld) {
    return Character.getNumericValue(input.charAt(0));
  }
}
*/
