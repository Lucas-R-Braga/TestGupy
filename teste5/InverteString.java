package teste5;

import java.util.Scanner;

public class InverteString {

    public static String inverterString(String str) {
        // Converte a string para um array de caracteres
        char[] caracteres = str.toCharArray();
        
        // Definindo os índices inicial e final para inverter os caracteres
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        // Itera sobre o array de caracteres até que o índice inicial seja menor que o índice final
        while (inicio < fim) {
            // Troca os caracteres de posição
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            
            // Atualiza os índices
            inicio++;
            fim--;
        }
        
        // Cria uma nova string com os caracteres invertidos
        return new String(caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira a string
        System.out.print("Digite uma string para inverter: ");
        String str = scanner.nextLine();
        
        // Chama o método inverterString para inverter a string fornecida
        String stringInvertida = inverterString(str);
        
        // Imprime a string invertida
        System.out.println("String invertida: " + stringInvertida);
        
        scanner.close();
    }
}

