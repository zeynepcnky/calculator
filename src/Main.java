

import java.util.Scanner;

//Java ile 4 işlem yapan hesap makinası
public class Main {
    public static void main(String[] args) {
        int a,b;
        int select;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FİRST VALUE: " );
        a = sc.nextInt();

        System.out.println("ENTER THE SECOND VALUE: " );
        b = sc.nextInt();

        System.out.println("1-Sum\n2-Subtract\n3-Multiply\n4-Divide");
        System.out.println("CHOOSE THE OPERATİON:  " );
        select = sc.nextInt();

        while(select !=0 ){

            if(select == 1){
                sum(a,b);
                return;
            }
            else if(select == 2){
                sub(a,b);
                return;
            }
            else if(select == 3){
                multiply(a,b);
                return;
            }
            else if(select == 4){
                divide(a,b);
                return;
            }else {
                System.out.println("THIS IS NOT A NUMBER");
            }
        }

    }
        static void sum (int a, int b) {
           int sum = a+b;
           System.out.println("Sum of " + a + " and " + b + " is " + sum);
        }
        static void sub (int a, int b) {
           int sub = a-b;
           System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
        }
        static void multiply (int a, int b) {
        int multi = a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + multi);
        }
        static void divide (int a, int b) {
        int div = a/b;
            System.out.println("Division of " + a + " and " + b + " is " + div);
        }

    }
