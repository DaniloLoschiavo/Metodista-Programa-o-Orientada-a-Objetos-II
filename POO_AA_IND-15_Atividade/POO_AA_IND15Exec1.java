import java.util.Scanner;

/**
 * Crie uma classe Televisor. Essa classe deve possuir três atributos:
 * canal (inicia em 1 e vai até 16)
 * volume (inicia em 0 e vai até 10)
 * ligado (inicia em desligado ou false)
 * e a seguinte lista de métodos:
 * aumentarVolume() //Aumenta em 1 o volume
 * reduzirVolume() //Diminui em 1 o volume
 * subirCanal() //Aumenta em 1 o canal
 * descerCanal() //Diminui em 1 o canal
 * ligarTelevisor() //Liga a televisão
 * desligarTelevisor() //Desliga a televisão
 * mostraStatus() //Dizer qual o canal, o volume e se o televisor está ligado
 * 
 * Nos métodos informe se é possível realizar a operação, por exemplo, 
 * se o volume estiver no 10 e chamar o método aumentarVolume() novamente imprima uma mensagem de aviso, etc.
 * Quando desligado, nosso televisor deve voltar o canal e o volume a seus valores iniciais e não deve realizar nenhuma operação.
 * 
 * Crie uma classe para testar a classe Televisao
 * 
 * @author Danilo Loschiavo
 */
public class POO_AA_IND15Exec1 {

    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do{
            televisor.mostraStatus();
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Aumentar Volume");
            System.out.println("2 - Reduzir Volume");
            System.out.println("3 - Subir Canal");
            System.out.println("4 - Descer Canal");
            System.out.println("5 - Ligar Televisor");
            System.out.println("6 - Desligar Televisor");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = entrada.nextInt();
            System.out.println("-----------------------------------");
            switch(opcao){
                case 1:
                    televisor.aumentarVolume();
                    break;
                case 2:
                    televisor.reduzirVolume();
                    break;
                case 3:
                    televisor.subirCanal();
                    break;
                case 4:
                    televisor.descerCanal();
                    break;
                case 5:
                    televisor.ligarTelevisor();
                    break;
                case 6:
                    televisor.desligarTelevisor();
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