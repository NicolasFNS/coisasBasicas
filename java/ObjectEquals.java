public static boolean contains(Object[] array, Object value) {
    //if (array == null) return false; para não comparar nada nulo
    for (Object element : array) {
        if (Objects.equals(element, value)) return true;
    }
    return false;
}

/*
o desafio pedia para verificar se um objeto expecífico existia na lista de arrays, 
também dá para usar o conteúdo do arquivo FindStringInObject.java no lugar(o que eu fiz), ou até:

public class Solution {
    public static boolean check(Object[] a, Object x) {
        return java.util.Arrays.asList(a).contains(x);
    }
}

*/
