package Arrays1D;
import java.util.Scanner;
public class OneDAddition {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("This program does addition operations between two array elements");
    System.out.print("Enter the size of the first array:");
    int size1=sc.nextInt();
    int[] arr1=new int[size1];
    for(int i=0;i<size1;i++){
        System.out.print("Enter the element at arrray1["+(i+1)+"]:");
        arr1[i]=sc.nextInt();
        System.out.println();
    }
    System.out.print("Enter the size of the second array:");
    int size2=sc.nextInt();
    int[] arr2=new int[size2];
    for(int j=0;j<size2;j++){
        System.out.print("Enter the element at array2["+(j+1)+"]:");
        arr2[j]=sc.nextInt();
        System.out.println();
        }
    int maxsize=Math.max(size1,size2);
    int[] result=new int[maxsize];
    System.out.print("The array after adding two array elements is:");
    for(int i=0; i<maxsize ; i++){
        if(size1<size2) {
            if(i<size1) {
                System.out.print(arr1[i] + arr2[i] + " ");
            }
            else{
                System.out.print(arr2[i]+" ");
            }
        }
        else{
            if(i<size2){
                System.out.print(arr1[i]+arr2[i]+" ");
            }
            else{
                System.out.print(arr1[i]+" ");
            }
        }
    }
}
}
