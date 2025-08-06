import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();


        System.out.print("escolha a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado;


        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("operação inválida.");
        }

        sc.close();
    }
}
