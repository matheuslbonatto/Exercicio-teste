

public class Exercicio1 {
    public static void main(String[] args) {
            /*1. Utilizando (While), construir um programa que apresente a soma dos cem 
             primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100). */
   
     int contador = 1;    
     int soma = 0;
     
     while (contador <= 100) {
        soma = soma + contador;
        System.out.println(soma);

        contador = contador + 1;
    }  
    }
    
}
