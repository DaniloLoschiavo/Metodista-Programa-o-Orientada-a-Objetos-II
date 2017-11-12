/**
 * Crie uma classe Televisor. Essa classe deve possuir três atributos:
 * canal (inicia em 1 e vai até 16)
 * volume (inicia em 0 e vai até 10)
 * ligado (inicia em desligado ou false)
 * 
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
 * @author Danilo Loschiavo
 */
public class Televisor {
    int canal = 1; //inicia em 1 e vai até 16
    int volume = 0; //inicia em 0 e vai até 10
    boolean ligado = false; //inicia em desligado ou false
    
    public void aumentarVolume(){
        if(ligado){ //Se televisor ligado
            if(volume < 10)//Se volume menor que 10
                volume++;//Aumenta em 1 o volume
            else
                System.out.println("O Volume já está no maximo!");
        }else {
            System.out.println("Não é possivel com o Televisor desligado.");
        }
    }
    
    public void reduzirVolume(){
        if(ligado){ //Se televisor ligado
            if(volume > 0)//Se volume maior que 0
                volume--;//Diminui em 1 o volume
            else
                System.out.println("O Volume já está no minimo!");
        }else {
            System.out.println("Não é possivel com o Televisor desligado.");
        }
    }
    
    public void subirCanal(){
        if(ligado){ //Se televisor ligado
            if(canal < 16)//Se canal menor que 16
                canal++;//Aumenta em 1 o canal
            else
                System.out.println("Não possui mais canais acima!");
        }else {
            System.out.println("Não é possivel com o Televisor desligado.");
        }
    }
    
    public void descerCanal(){
        if(ligado){ //Se televisor ligado
            if(canal > 1)//Se canal maior que 1
                canal--;//Diminui em 1 o canal
            else
                System.out.println("Não possui mais canais abaixo!");
        }else {
            System.out.println("Não é possivel com o Televisor desligado.");
        }
    }
    
    public void ligarTelevisor(){
        if(!ligado) //Se televisor desligado
            ligado = true; //Liga televisor
        else
            System.out.println("Não é possivel, o Televisor já está ligado!");
    }
    
    public void desligarTelevisor(){
        if(ligado) {//Se televisor ligado
            ligado = false; //Desliga televisor
            canal = 1; // Volta o canal ao valor original 1
            volume = 0; // Volta o volume ao valor original 0
        }
        else
            System.out.println("Não é possivel, o Televisor já está desligado!");
    }
    
    public void mostraStatus(){
        System.out.println("-----------------------------------");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("-----------------------------------");
    }
}