package Array2D;
import java.util.Scanner;
public class TwoDMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int columns=sc.nextInt();
        int[][] array1=new int[rows][columns];
        int[][] array2=new int[rows][columns];
        System.out.println("<=====For the first array=====>");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the element at matrix["+i+"]["+j+"}:");
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("<=====For the second array====>");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the element at matrix["+i+"]["+j+"]:");
                array2[i][j]=sc.nextInt();
            }
        }
        //matrix mulitplication
        int[][] multiplyresult=new int[rows][columns];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2[i].length;j++){
                for(int k=0;k<array1[i].length;k++){
                    multiplyresult[i][j]+=array1[i][k]*array2[k][j];
                }
            }
        }
        System.out.print("The matrix after multiplication of the two matrix is:");
        for(int i=0;i<multiplyresult.length;i++){
            for(int j=0;j<multiplyresult[i].length;j++){
                System.out.print(multiplyresult[i][j]+" ");
            }
        }
    }
}
