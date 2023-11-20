package edu.diego.primeirasemana;

public class Operadores {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Classes de Operadores
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15/3;
        int modulo = 18 % 3;
        double resultado = (10*7) + (20/4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);


        //Operadores unarios, onde trocamos a polaridade dos numeros
        //+ = Torna o numero positivo
        //- = Torna o numero negativo
        //++  = incerementa o valor em 1 unidade
        //-- = Decrementa o valor em 1 unidade
        //! nega o valor de uma expressão booleana; Exemplos:

        int numero = 5;
        boolean valorMaiorQueCinco = true;

        System.out.println(+ numero);
        System.out.println(- numero);
        System.out.println(++ numero);
        System.out.println(-- numero);
        System.out.println(! valorMaiorQueCinco);

        //Operadores relacionais: 
        //  == Igual Á
        //  != Diferente De
        //  >  Maior Que
        //  >= Maior ou Igual A
        //  <  Menor Que
        //  <= Menor ou Igual Á

        //Operados Logicos:
        // && a condição 1 E condição 2 São verdadeiras?
        //  || a condição 1 OU condição 2 são verdadeiras?


       
    }
}
