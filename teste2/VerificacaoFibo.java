package teste2;

public class VerificacaoFibo {
    public static boolean verificaFibonacci(int num) {
        int a = 0;
        int b = 1;
        
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == num;
    }
}
