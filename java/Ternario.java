/*
  operação ternária, apenas uma forma de simplificação do if else, no exemplo logo abaixo segue e estrutura:
  if(c[i] < '5')
    c[i]=0;
  else{
    c[i]=1;
  }
*/

public class Ternario {
  public static String tern() {
    String numeros = "09091728307108237097374356345";
    char c[] = numeros.toCharArray(); //cria um array com base na outra (fácil para alterar os valores)
    
    for (int i = 0; i < c.length; i++){
      c[i] = c[i] < '5' ? '0' : '1'; //processo que decide se vai ser 0 ou 1
    }
    
    return new String(c); //envia o resultado como uma nova string
  }
}
