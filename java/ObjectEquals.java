//comparação de obejtos, também dá para usar o conteúdo do arquivo FindStringInObject.java no lugar

public static boolean contains(Object[] array, Object value) {
    //if (array == null) return false; para não comparar nada nulo
    for (Object element : array) {
        if (Objects.equals(element, value)) return true;
    }
    return false;
}
