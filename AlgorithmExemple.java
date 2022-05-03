import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmExemple {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[]arr = {1, 2, 3, 4, 5, 6, 1, 5, 6, 7, 8};
        
        System.out.println("Floyd Tortoise and Hare");
         System.out.println("Array: " + Arrays.toString(arr));
          System.out.println("Precione Enter para achar o valor duplicado");
           String a = s.nextLine();
            s.close();
           
        findDuplicate(arr);
    }
    
    static void findDuplicate(int arr[])
    {

    int tortoise = arr[0]; 
    int hare = arr[0];

    while (true)
    {
        tortoise = arr[tortoise];
        hare = arr[arr[hare]];
        
        if (tortoise == hare)
            break;
    }
    tortoise = arr[0];
 
    while (tortoise != hare)
    {
        tortoise = arr[tortoise];
        hare = arr[hare];
    }
 
    System.out.print("Numero duplicado: "+tortoise);
    }
}
