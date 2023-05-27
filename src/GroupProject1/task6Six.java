package GroupProject1;

import java.util.Scanner;

public class task6Six {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int primeNumber=scanner.nextInt();

        if(primeNumber%2!=0&&primeNumber%3!=0&&primeNumber>0|| primeNumber==2 || primeNumber==3)        {
            System.out.println(primeNumber+" is a prime number");
        }else
        {
            System.out.println(primeNumber+" is not a prime number");

        }




    }
}
