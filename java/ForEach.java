//Completar as funções quadradas, quando cada número passa (na lista "n"), o código multiplica por ela mesma e soma todos os resulados

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
