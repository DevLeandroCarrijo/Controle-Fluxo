import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Entrada para o primeiro número
        System.out.print("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Entrada para o segundo número

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimindo a mensagem de erro
            System.out.println(exception.getMessage());
        } finally {
            terminal.close(); // Garantindo que o Scanner seja fechado
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é MAIOR que o segundo e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // Realizar o loop para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
