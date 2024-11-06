import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura que será convertida em Fahrenheit: ");
        double temperatura = scanner.nextDouble();

        double fahrenheit = conversor.converte(temperatura);

        System.out.print("A temperatura que você digitou foi: " + temperatura + "º, convertida em Fahrenheit ela fica: " + fahrenheit + "º");
    }
}
