import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Frank Castle";
        String tipoConta = "Conta-Corrente";
        double saldo = 15.19;
        double recebe = 0;
        double transferir = 0;
        int opcao = 0;

        System.out.println("**********************");
        System.out.println("Nome cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("**********************");

        String menu = """
                                    Olá ! Escolha uma das opções abaixo para começar:
                                
                                    1 - Consultar Saldo
                                    2 - Receber Valor
                                    3 - Transfeir Valor
                                    4 - Sair
                                    
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(nome + " seu Saldo atual é : " + saldo);
            }
            if (opcao == 2) {
                System.out.println(nome + " digite o valor recebido: ");
                recebe = leitura.nextDouble();
                saldo += recebe;
                System.out.println(nome + " seu Saldo atual é : " + saldo);
            }
            if (opcao == 3) {
                System.out.println(nome + " Digite o valor transferido: ");
                transferir = leitura.nextDouble();
                if(saldo > transferir) {
                    saldo -= transferir;
                    System.out.println(nome + " seu Saldo atual é : " + saldo);
                }else{
                    System.out.println( "Saldo insuficiente para a transferencia");
                }
            }
            if (opcao == 4) {
                System.out.println(nome + " obrigado por utilizar os nossos serviços, volte sempre!");
            }
            if (opcao != 4){
                System.out.println( "Opção invalida");
            }
        }


    }
}