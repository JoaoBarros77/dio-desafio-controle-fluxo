import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro parâmetro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("Insira o segundo parâmetro: ");
        int segundoParametro = sc.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }
        for (int i = 1; i <= (segundoParametro - primeiroParametro) ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
