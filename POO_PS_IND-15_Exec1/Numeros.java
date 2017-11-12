/**
* Classe utilizada para representar um conjunto de números, em que podemos
* localizar o valor do maior elemento, menor elemento e
* media dos elementos do vetor.
*
* @author Danilo Loschiavo
*/

public class Numeros {

    int[] valores;

    public void localizarMaior() {
        /* Deve imprimir o valor do maior elemento do vetor. */
        int maiorNumero = valores[0];
        for(int n : valores)
            if(n > maiorNumero)
                maiorNumero = n;
        
        //Imprime maior
        System.out.println("O maior número do vetor é: " + maiorNumero);
    }

    public void localizarMenor() {
        /* Deve imprimir o valor do menor elemento do vetor. */
        int menorNumero = valores[0];
        for(int n : valores)
            if(n < menorNumero)
                menorNumero = n;
        
        //Imprime menor
        System.out.println("O menor número do vetor é: " + menorNumero);
    }

    public void calcularMedia() {
        /* Deve imprimir a media de todos os elementos do vetor. */
        int soma = 0;
        for(int n : valores)
            soma += n;
        
        //Imprime média
        System.out.println("A média do vetor é: " + soma/valores.length);
    }

}