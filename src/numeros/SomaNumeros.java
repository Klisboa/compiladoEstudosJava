package numeros;

import java.util.Scanner;


public class SomaNumeros {
    public static void main(String[] args) {

        int valor1 = 0;
        int valor2 = 0;
        boolean ehInteiro = true;
        boolean ehInteiro2 = true;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Olá! bem vindo!");
        System.out.println("Digite o Primeiro numero: ");

        while (ehInteiro) {
            try {
                valor1 = Integer.valueOf(leitura.next());
                ehInteiro = false;
            } catch (Exception ex) {
                System.out.println("Não é um número inteiro.");
                System.out.println("Digite novamente");

            }
        }

        System.out.println("Digite o segundo valor: ");

        while (ehInteiro2) {

            try {
                valor2 = Integer.valueOf(leitura.next());
                ehInteiro2 = false;
            } catch (Exception ex) {
                System.out.println("Não é um número inteiro.");
                System.out.println("Digite novamente");
            }
        }


        int numero = valor1 + valor2;


        System.out.println("A soma dos valores é : " + numero);

    }

}
