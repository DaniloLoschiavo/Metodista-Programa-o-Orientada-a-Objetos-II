import java.text.NumberFormat;

/** Crie uma classe que representa uma conta bancaria que possua o número daconta e saldo. Está classe também deve executar os seguintes métodos:
 *
 * • extrato (Mostra na tela o número e o saldo da conta)
 * • saqueCem (Retira 100 do saldo da conta)
 * • depositoCem (Adiciona 100 ao saldo da conta)
 * • saqueCinquenta (Retira 50 do saldo da conta)
 * • depositoCinquenta (Adiciona 50 ao saldo da conta)
 * 
 * @author Danilo Loschiavo
 */
public class ContaBancaria {
    
    int numeroConta;
    double saldo;
    
    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void extrato() {
        /* Mostra na tela o número e o saldo da conta */
        System.out.println("--------------EXTRATO--------------");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo Atual: " + NumberFormat.getCurrencyInstance().format(saldo));
        System.out.println("-----------------------------------");
    }

    public void saqueCem() {
        /* Retira 100 do saldo da conta */
        saldo -= 100;
        System.out.println("Saque Efetuado: -R$ 100,00");
        extrato();
    }

    public void depositoCem() {
        /* Adiciona 100 ao saldo da conta */
        saldo += 100;
        System.out.println("Depósito Efetuado: +R$ 100,00");
        extrato();
    }

    public void saqueCinquenta() {
        /* Retira 50 do saldo da conta */
        saldo -= 50;
        System.out.println("Saque Efetuado: -R$ 50,00");
        extrato();
    }

    public void depositaCinquenta() {
        /* Adiciona 50 ao saldo da conta */
        saldo += 50;
        System.out.println("Depósito Efetuado: +R$ 50,00");
        extrato();
    }
    
}