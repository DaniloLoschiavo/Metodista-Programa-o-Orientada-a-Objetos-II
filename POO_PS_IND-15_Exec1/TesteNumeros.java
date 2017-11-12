/**
* Testa a classe Numeros.
*
* @author Danilo Loschiavo
*/

public class TesteNumeros {

    public static void main(String[] args) {

        /* 1- Crie um vetor de inteiro com 10 valores. */
        int[] vetorNumeros = {55, 21, 32, 87, 123, 1, 36, 655, 121, 44};

        /* 2- Crie um objeto da classe Numeros, passando o vetor de inteiros para o atributo vaores*/
        Numeros nums = new Numeros();
        nums.valores = vetorNumeros;

        nums.localizarMaior();
        nums.localizarMenor();
        nums.calcularMedia();
    }

}
