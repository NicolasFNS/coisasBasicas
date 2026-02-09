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
