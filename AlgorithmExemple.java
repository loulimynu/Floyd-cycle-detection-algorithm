package louli.teste;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author white
 */
public class AlgorithmExemple {

    public static void main(String[] args) {
        //CRIANDO UM ARRAY ALEATORIO COM 1 NUMERO DUPLICADO
        
        //variaveis de inicializacao
        Scanner s = new Scanner(System.in);//variavel de scan de input
        int[]arr = {1, 2, 3, 4, 5, 6, 1, 5, 6, 7, 8};//array de 10 inteiros
        
        System.out.println("Floyd Tortoise and Hare");
         System.out.println("Array: " + Arrays.toString(arr));
          System.out.println("Precione Enter para achar o valor duplicado");
           String a = s.nextLine();
            s.close();//fecha o scnner
           
        findDuplicate(arr);
    }
    
    static void findDuplicate(int arr[])
    {
    // variaveis de inicializacao, ambas comecam no index 0 do array
    int tortoise = arr[0]; 
    int hare = arr[0];
 
    //inicia um loop q so termina quando encontrarmos o elemento duplicado
    while (true)
    {
        tortoise = arr[tortoise];
        hare = arr[arr[hare]];//coelho se move 2 vezes mais que a tartaruga
        
        if (tortoise == hare)
            //break termina o circulo de coolo independente da circuntancia
            break;
    }
    //retorna o loop ao ponto de inicio, elemento encontrado vai se o valor duplicado
    tortoise = arr[0];
 
    while (tortoise != hare)
    {
        //enquanto os valores nao sao iguais eles seguirao pegando o valor seguinte
        tortoise = arr[tortoise];
        hare = arr[hare];
    }
 
    //printa o valor duplicado
    System.out.print("Numero duplicado: "+tortoise);
    }
}
