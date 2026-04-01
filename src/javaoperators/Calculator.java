package javaoperators;
import java.util.Scanner;


public class Calculator{
        int addition(int a,int b){
            return a+b;
        }
        int subtraction(int a,int b){
            if(a>b){
                return a-b;
            }
            else{
                return b-a;
            }
        }
        int multiplication(int a,int b){
            return a*b;
        }
        int division(int a,int b){
            if(b==0){
                System.out.println("Divison by zero is not possible");
                return 0;
            }
            else{
                return a/b;
            }
        }
        int  modulo(int a,int b){
            if(b==0){
                System.out.println("Divison by zero is not possible");
                return 0;

            }
            else{
                return a%b;
            }
        }
        public static void main(String[]args){
            Calculator obj=new Calculator();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any calculation");
            String inputs=sc.nextLine();
            String[] parts=inputs.split("(?<=[-+*/%])|(?=[-+*/%])");
            int a=Integer.parseInt(parts[0]);
            char c=parts[1].charAt(0);
            int b=Integer.parseInt(parts[2]);
            switch(c){
                case'+':
                    int result=obj.addition(a,b);
                    System.out.println("=" +result);
                    break;
                case'-':
                    int result1=obj.subtraction(a,b);
                    System.out.println("=" +result1);
                    break;
                case'*':
                    int result2=obj.multiplication(a,b);
                    System.out.println("=" +result2);
                    break;
                case'/':
                    int result3=obj.division(a,b);
                    System.out.println("=" +result3);
                    break;
                case'%':
                    int result4=obj.modulo(a,b);
                    System.out.println(result4);
                    break;
                default:
                    System.out.println("Enter a valid operation");
            }
        }

    }


