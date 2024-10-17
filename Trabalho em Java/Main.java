import java.util.Scanner;

class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int somar() {
        return num1 + num2;
    }

    public int subtrair() {
        return num1 - num2;
    }

    public int dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }

    public int multiplicar() {
        return num1 * num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;
        
        while (true) {
            System.out.println("Digite um operador (+, -, *, /) ou '.' para sair:");
            operador = scanner.next();
            
            if (operador.equals(".")) {
                break;
            }

            System.out.println("Digite o primeiro número:");
            int num1 = scanner.nextInt();
            
            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();

            Calculadora calculadora = new Calculadora(num1, num2);

            switch (operador) {
                case "+":
                    System.out.println("Resultado: " + calculadora.somar());
                    break;
                case "-":
                    System.out.println("Resultado: " + calculadora.subtrair());
                    break;
                case "*":
                    System.out.println("Resultado: " + calculadora.multiplicar());
                    break;
                case "/":
                    System.out.println("Resultado: " + calculadora.dividir());
                    break;
                default:
                    System.out.println("Operador inválido.");
            }
        }

        scanner.close();
    }
}
