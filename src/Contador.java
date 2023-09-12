import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            ExceptionNumber(parametroDois,parametroUm);
            for (int contador = parametroUm ; contador < parametroDois; contador++){
                System.out.println("Imprimindo o número: "+ contador);

            };
        } catch (ParametrosInvalidosException e) {
           System.out.println("O segundo número precisa ser maior que o primeiro");
           
        }

        terminal.close();
    }

     public static void ExceptionNumber(int parametroDois,int parametroUm) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
            
        } 
    }
}
