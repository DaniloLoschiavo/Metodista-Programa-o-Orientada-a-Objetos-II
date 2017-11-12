import java.util.Scanner;

/**
 * Crie uma classe que representa uma conta bancaria que possua o número daconta e saldo. Está classe também deve executar os seguintes métodos:
 *
 * • extrato (Mostra na tela o número e o saldo da conta)
 * • saqueCem (Retira 100 do saldo da conta)
 * • depositoCem (Adiciona 100 ao saldo da conta)
 * • saqueCinquenta (Retira 50 do saldo da conta)
 * • depositoCinquenta (Adiciona 50 ao saldo da conta)
 * 
 * Ao final das operações saque e deposito, sua classe deve imprimir o número e o
 * saldo da conta.
 * Crie uma classe para testar os métodos da classe conta bancaria 
 * 
 * @author Danilo Loschiavo
 */
public class POO_PS_IND15_Exec2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroConta;
        double saldo;
        
        System.out.print("Olá, insira o numero da conta: ");
        numeroConta = entrada.nextInt();
        System.out.print("Insira o saldo inicial: ");
        saldo = entrada.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(numeroConta, saldo);
        int opcao;
        do{
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Extrato");
            System.out.println("2 - Sacar R$100,00");
            System.out.println("3 - Depositar R$100,00");
            System.out.println("4 - Sacar R$50,00");
            System.out.println("5 - Depositar R$50,00");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = entrada.nextInt();
            System.out.println("-----------------------------------");
            switch(opcao){
                case 1:
                    conta.extrato();        
                    break;
                case 2:
                    conta.saqueCem();        
                    break;
                case 3:
                    conta.depositoCem();        
                    break;
                case 4:
                    conta.saqueCinquenta();        
                    break;
                case 5:
                    conta.depositaCinquenta();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 0);
    }
    
}