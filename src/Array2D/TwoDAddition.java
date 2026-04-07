package Array2D;
import java.util.Scanner;
public class TwoDAddition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows of the 2D matrix(matrix operaions can only be done between square matrices):");
        int rows=sc.nextInt();
        System.out.print("Etner the number of columns of the 2D matrix:");
        int columns=sc.nextInt();
        int[][] array1=new int[rows][columns];
        int[][] array2=new int[rows][columns];
        System.out.println("<=====Enter the elements of the first array=====>");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns; j++){
                System.out.print("Enter the element at array1{"+i+"}{"+j+"}:");
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("<=====Enter the elements of the second array=====>");
        for(int i=0; i<rows ;i++){
            for( int j=0; j<columns ;j++){
                System.out.print("Enter the element at array2{"+i+"}{"+j+"}:");
                array2[i][j]=sc.nextInt();
            }
        }
        System.out.print("The matrix after the addition of the two matrixs is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns ;j++){
                System.out.print(array1[i][j]+array2[i][j]+" ");
            }
        }
    }
}
