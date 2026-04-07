package Arrays1D;
import java.util.Scanner;
public class OneDArrayReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0; i<size ;i++){
            System.out.print("Enter the array element at array["+i+"]:");
            array[i]=sc.nextInt();
        }
        System.out.print("The Reverse of the enetered string is:");
        for(int i=size-1; i>=0 ;i--){
            System.out.print(array[i]+" ");
        }

    }
}
