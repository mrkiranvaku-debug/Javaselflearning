package Arrays1D;
import java.util.Scanner;
public class OneDSubtraction {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("This program does subtracion operations between two array's elements");
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
        char choice;
        while(true) {
            System.out.print("You have three options:\n1.Array1-Array2\n2.Array2-Array1\n3.Absolute Difference");
            System.out.print("Enter the options serial number here:");
            choice = sc.next().charAt(0);
            if(choice=='1' || choice=='2' || choice=='3'){
                break;
            }
            else{
                System.out.println("Enter a valid choice");
            }
        }
        int[] results=new int[maxsize];
        int[] result2=new int[maxsize];
        switch(choice){
            case '1':
                for(int i=0;i<maxsize;i++){
                    if(size1<maxsize){
                        if(i<size1){
                            System.out.print(arr1[i]-arr2[i]+" ");
                        }
                        else{
                            System.out.print("-"+arr2[i]+" ");
                        }
                    }
                    else{
                        if (i < size2) {
                            System.out.print(arr1[i]-arr2[i]+" ");
                        }
                        else{
                            System.out.print("-"+arr1[i]+" ");
                        }
                    }
                }
                break;
            case '2':
                for(int i=0; i<maxsize;i++){
                    if(size1<maxsize){
                        if(i<size1){
                            System.out.print(arr2[i]-arr1[i]+" ");
                        }
                        else{
                            System.out.print("-"+arr1[i]+" ");
                        }
                    }
                    else{
                        if (i < size2) {
                            System.out.print(arr2[i]-arr1[i]+" ");
                        }
                        else{
                            System.out.print("-"+arr2[i]+" ");
                        }
                    }
                }
                break;
            case '3':
                for(int i=0; i<maxsize ;i++){
                    if(size1<maxsize){
                        if(i<size1){
                            results[i]=arr2[i]-arr1[i];
                            if(result[i]<0){
                                System.out.print(arr1[i]-arr2[i]+" ");
                            }
                            else{
                                System.out.print(results+" ");
                            }
                        }
                        else{
                            System.out.print(arr1[i]+" ");
                        }
                    }
                    else{
                        if (i < size2) {
                            result2[i]=arr2[i]-arr1[i];
                            if (result2[i] < 0) {
                                System.out.print(arr1[i]-arr2[i]+" ");
                            }
                            else{
                                System.out.print(result2+" ");
                            }
                        }
                        else{
                            System.out.print(arr2[i]+" ");
                        }
                    }

            }
        }

    }
}
