//desafio pediu uma função que retorna a forma maiuscula de uma string

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

