import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner= new Scanner(System.in);
        System.out.print("Digite seu nome: "); var nome = scanner.next();
        System.out.print("Digite seu ano de nascimento:  "); var anoNascimento = scanner.nextInt();
        int idade= 2025- anoNascimento;
        System.out.printf("\nOlá %s, você tem %s anos",nome,idade);

        System.out.print("Digite o tamanho do quadrado  "); var tamanhoQuadrado = scanner.nextInt();
        int area = tamanhoQuadrado*tamanhoQuadrado;
        System.out.printf("\nA área do quadrado é %s",area);


    }
}