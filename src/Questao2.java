import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele pertence a sequencia Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequência Fibonacci");
        }else{
            System.out.println("O número " + numero + " não pertence a sequência Fibonacci");
        }

    }

    private static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int fibonacci = a + b;

        if (numero == 0){
            return true;
        }

        while (fibonacci <= numero) {
            if (numero == fibonacci) {
                return true;
            }

            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        return false;
    }
}
