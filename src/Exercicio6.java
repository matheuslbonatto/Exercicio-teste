import javax.sound.midi.Soundbank;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Exercicio6 {
    public static void main(String[] args) {
        /*6. Elaborar um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit, 
        de dez em dez graus, iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius. 
        O programa deve apresentar os valores das duas temperaturas. 
        Para converter grau Celsius para Fahrenheit, basta multiplicar a temperatura em graus Celsius por 1,8 e somar 32. */


        
        double fahrenheit ;
        
        System.out.println("Conversão de Celsius para Fahrenheit:");

        for (int Celsius = 10;  Celsius <= 100; Celsius += 10){
            fahrenheit = ((Celsius * 1.8) + 32);
            System.out.println( "Celsius: " + Celsius + " = Fahrenheit: " + fahrenheit );
        }
        

    }

    
}
