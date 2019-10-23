import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1 , num2 , sum, product, average;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("First number? : ");
        num1 = keyboard.nextInt();
        System.out.println("Second number? : ");
        num2 = keyboard.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;
        if(sum > 200){
            System.out.println("sum is : " + sum + "*");
            System.out.println("product is  : " + product);
            System.out.println("average is :" + average);
        }
        else{
            System.out.println("sum is : " + sum);
            System.out.println("product is  : " + product);
            System.out.println("average is :" + average);
        }
    }
}
