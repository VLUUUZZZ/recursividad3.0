public class BuscarLetra {

    public static int contarOcurrencias(String cadena, char letra) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }
        int suma = (cadena.charAt(0) == letra) ? 1 : 0;
        return suma + contarOcurrencias(cadena.substring(1), letra);
    }
}
