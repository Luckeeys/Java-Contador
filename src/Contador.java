import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroNumero = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        }
        catch (ParametrosInvalidosException err) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (segundoNumero < primeiroNumero)
            throw new ParametrosInvalidosException();
        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
