package Loops;
import java.util.Scanner;
public class Forloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting and ending numbers9 num1 to num2):");
        String range=sc.nextLine();
        int count=0;
        String num1="";
        String num2="";
        for(int i=0; i<range.length(); i++){
            char ch=range.charAt(i);
            if(Character.isDigit(ch)){
                if(count==0){
                    num1+=ch;
                }
                else{
                    num2+=ch;
                }
            }
            else{
                count=1;
            }
        }
        int start=Integer.parseInt(num1);
        int end=Integer.parseInt(num2);
        for(int i=start;i<end;i++){
            System.out.print(i+" ");
        }
    }
}
