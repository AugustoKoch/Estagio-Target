public class Questao5 {
    public static void main(String[] args) {

        String string = "Hello world!";
        String stringInvertida = "";

        stringInvertida = inverterString(string);
        System.out.println("String: " + string + "\nString invertida: " + stringInvertida);
    }

    private static String inverterString(String string) {
        String stringInvertida = "";
        for (int i = 0; i < string.length(); i++) {
            stringInvertida += string.charAt(string.length() - i -1);
        }
        return stringInvertida;
    }
}